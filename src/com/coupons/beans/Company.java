package com.coupons.beans;

import java.util.*;

public class Company {

	//
	//attributes
	//
	private long company_id;
	private String name;
	private String pass;
	private String email;
	private Collection<Coupon> coupons;

	//
	// Constructor
	//
	public Company(long company_id, String name, String pass, String email,
			Collection<Coupon> coupons) {
		super();
		this.company_id = company_id;
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.coupons = coupons;
	}

	//
	// Empty constructor
	//
	public Company() {
	}

	
	public long getCompany_id() {
		return company_id;
	}

	public void setCompany_id(long company_id) {
		this.company_id = company_id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		return "Company [company_id=" + company_id + ", name=" + name
				+ ", pass=" + pass + ", email=" + email + ", coupons="
				+ coupons + "]";
	}

	
}
