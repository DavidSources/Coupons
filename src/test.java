import java.util.*;

import org.omg.CORBA.portable.ValueOutputStream;

import com.coupons.beans.Coupon;
import com.coupons.dao.CouponDAO;
import com.coupons.dbdao.CouponDBDao;

public class test {

	public static void main(String[] args) {

		//////////////////////////////////////////////////////////
		// create coupon
		//////////////////////////////////////////////////////////
		CouponDAO dao = new CouponDBDao();
//		dao.createCoupon(new Coupon(null, ));
		
		//////////////////////////////////////////////////////////
		// get a specific coupon
		//////////////////////////////////////////////////////////
//		Coupon coupon = dao.getCoupon(17);
//		
//		System.out.println("******  SPECIFIC COUPONS *********");
//		System.out.println(coupon.toString());

		//////////////////////////////////////////////////////////
		// get all coupons
		//////////////////////////////////////////////////////////
//		List<Coupon> coupons = dao.getAllCoupons();
//		
//		System.out.println("******  ALL COUPONS *********");
//		for(Coupon c : coupons)
//		{
//			System.out.println(c);
//		}
		
		java.sql.Date startDate = java.sql.Date.valueOf("2015-08-09");
		java.sql.Date endDate = java.sql.Date.valueOf("2020-08-09");
		Coupon coupon = new Coupon("Rocky", startDate, endDate, 300, "Rocky description", 35.5, "d:pictures");
		
		dao.createCoupon(coupon);
	}
}
