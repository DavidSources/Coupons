package com.coupons.dao;

import java.util.List;

import com.coupons.beans.Coupon;

public interface CouponDAO {
	
	public void createCoupon(Coupon coupon);
	public Coupon getCoupon(long id);
	public void updateCoupon(Coupon coupon);
	public void deleteCoupon(Coupon coupon);
	
	public List<Coupon> getAllCoupons();
}
