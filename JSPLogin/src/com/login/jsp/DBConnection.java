package com.login.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String uname="hr";
			String pwd="root";
			Connection con = DriverManager.getConnection(url,uname,pwd);
			return con;
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
