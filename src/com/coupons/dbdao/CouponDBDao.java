package com.coupons.dbdao;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import com.coupons.beans.Coupon;
import com.coupons.dao.*;

/*
 * This class 
 */
public class CouponDBDao extends BaseDaoDB implements CouponDAO {

	public CouponDBDao() {
	}

	@Override
	public void createCoupon(Coupon coupon) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;

		try {

			// 1. Get a connection to the DB
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/couponsDB_DVL", "student",
					"student");

			System.out.println("The connection to the DB was sucessful");

			// 2. Create a statement
			String query = "INSERT into couponsdb_dvl.coupon VALUES "
					+ "(?,?,?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);

			//No id insert for a new coupon insert
			myStmt.setNull(1, java.sql.Types.INTEGER);
			myStmt.setString(2, coupon.getTitle());
			myStmt.setDate(3, coupon.getStart_date());
			myStmt.setDate(4, coupon.getEnd_date());
			myStmt.setInt(5, coupon.getAmount());
			myStmt.setString(6, coupon.getMessage());
			myStmt.setDouble(7, coupon.getPrice());
			myStmt.setString(8, coupon.getImage());
			
			// 3. Execute the SQL statement
			myStmt.executeUpdate();
			
			// 4. Get the generated keys
			myRs = myStmt.getGeneratedKeys();

			//myRs.next();
			//System.out.println(myRs.toString());
			//long last_inserted_id = myRs.getLong(1);
		}
		catch ( Exception e)
		{
			String s = e.getMessage();
			
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public Coupon getCoupon(long id) {

		// The returned object will be null if no data was found in DB
		Coupon returnedCoupon = null;

		// build the query to retrieve data
		String query = "SELECT * FROM couponsdb_dvl.coupon WHERE coupon_id = "
				+ id + ";";

		// go to DB to get data
		ResultSet myRs = getData(query);

		// Parse the result into an object
		try {

			if (myRs.next()) {

				returnedCoupon = ConvertResultSetToCoupon(myRs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return returnedCoupon;
	}

	@Override
	public void updateCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCoupon(Coupon coupon) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Coupon> getAllCoupons() {
		// The returned object will be null if no data was found in DB
		List<Coupon> coupons = new ArrayList<Coupon>();

		// build the query to retrieve data
		String query = "SELECT * FROM couponsdb_dvl.coupon WHERE coupon_id;";

		// go to DB to get data
		ResultSet myRs = getData(query);

		// Parse the result into an object
		try {

			while (myRs.next()) {

				coupons.add(ConvertResultSetToCoupon(myRs));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return coupons;
	}

	private Coupon ConvertResultSetToCoupon(ResultSet myRs) {
		try {

			long coupon_id = myRs.getLong("coupon_id");
			String title = myRs.getString("title");
			Date start_date = myRs.getDate("start_date");
			Date end_date = myRs.getDate("end_date");
			int amount = myRs.getInt("amount");
			String message = myRs.getString("message");
			double price = myRs.getDouble("price");
			String image = myRs.getString("image");

			return new Coupon(coupon_id, title, start_date, end_date, amount,
					message, price, image);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
