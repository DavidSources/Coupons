package com.coupons.DBConnection;

import java.sql.*;

public class DBConnector {
	public ResultSet retrieve(String query) {

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try
		{
			// 1. Get a connection to the DB
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/couponsDB_DVL", "student", "student");

			System.out.println("The connection to the DB was sucessful for this query: " + query);			

			// 2. Create a statement
			myStmt = myConn.createStatement();
			
			// 3. Execute the SQL statement
			myRs = myStmt.executeQuery(query);
			
			if (myRs.next()) {
				
				long coupon_id = myRs.getLong("coupon_id");
				String title = myRs.getString("title");
				Date start_date = myRs.getDate("start_date");
				Date end_date = myRs.getDate("end_date");
				int amount = myRs.getInt("amount");
				String message = myRs.getString("message");
				double price = myRs.getDouble("price");
				String image = myRs.getString("image");
				
				
			}
		}
		catch ( SQLException e)
		{
			e.printStackTrace();
		}
		
		return myRs;
	}
}
