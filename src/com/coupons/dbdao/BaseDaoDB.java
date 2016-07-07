package com.coupons.dbdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDaoDB {

	//
	// Constructor
	//
	public BaseDaoDB() {
	}

	protected ResultSet getData(String query) {
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {
			// 1. Get a connection to the DB
			myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/couponsDB_DVL", "student",
					"student");

			System.out
					.println("The connection to the DB was sucessful for this query: "
							+ query);

			// 2. Create a statement
			myStmt = myConn.createStatement();

			// 3. Execute the SQL statement
			myRs = myStmt.executeQuery(query);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return myRs;
	}
}
