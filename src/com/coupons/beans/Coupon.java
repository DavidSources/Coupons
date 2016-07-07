package com.coupons.beans;

import java.sql.Date;

public class Coupon {

	//
	//attributes
	//
	private long coupon_id;
	private String title;
	private Date start_date;
	private Date end_date;
	private int amount;
	private String message;
	private double price;
	private String image;
	
	//
	// Constructor
	//
	public Coupon(long couponId, String title, Date start_date, Date end_date,
			int amount, String message, double price, String image) {
		this.coupon_id = couponId;
		this.title = title;
		this.start_date = start_date;
		this.end_date = end_date;
		this.amount = amount;
		this.message = message;
		this.price = price;
		this.image = image;
	}

	//
	// No id to insert to the DB
	//
	public Coupon(String title, Date s_date, Date e_date,
			int amount, String message, double price, String image) {
		this.title = title;
		this.start_date = s_date;
		this.end_date = e_date;
		this.amount = amount;
		this.message = message;
		this.price = price;
		this.image = image;
	}

	//
	// Empty Constructors
	//
	public Coupon() {
	}

	
	public long getCoupon_id() {
		return coupon_id;
	}

	public void setCoupon_id(long coupon_id) {
		this.coupon_id = coupon_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	//
	// ToString to represent an object as a text
	//
	@Override
	public String toString() {
		return "Coupon [couponId=" + coupon_id + ", title=" + title
				+ ", start_date=" + start_date + ", end_date=" + end_date
				+ ", amount=" + amount + ", message=" + message + ", price="
				+ price + ", image=" + image + "]";
	}
}
