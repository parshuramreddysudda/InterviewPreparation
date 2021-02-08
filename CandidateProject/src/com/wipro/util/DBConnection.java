package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
			return con;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public DBConnection() {

	}
}
