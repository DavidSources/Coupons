package com.coupons.beans;

import java.util.*;

public class Customer {

	//
	//attributes
	//
	private long customer_id;
	private String name;
	private String pass;
	private Collection<Coupon> coupons;

	//
	// Constructor
	//
	public Customer(long customer_id, String name, String pass, String email,
			Collection<Coupon> coupons) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.pass = pass;
		this.coupons = coupons;
	}

	//
	// Empty constructor
	//
	public Customer() {
	}

	
	public long getCustomer_id_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Collection<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(Collection<Coupon> coupons) {
		this.coupons = coupons;
	}


	//
	// To String
	//
	@Override
	public String toString() {
		return "Company [company_id=" + customer_id + ", name=" + name
				+ ", pass=" + pass  + ", coupons="
				+ coupons + "]";
	}

	
}
