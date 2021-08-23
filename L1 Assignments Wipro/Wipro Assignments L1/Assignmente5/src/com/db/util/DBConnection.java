package com.db.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getDBConnection(String className,String url,String uname,String pwd) {
		try {
			Class.forName(className);
//			System.out.println("Class anme is "+className+" Url is "+url+" uname is "+uname+" passoword is "+pwd);
			Connection con = DriverManager.getConnection(url,uname,pwd);
			return con;
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
