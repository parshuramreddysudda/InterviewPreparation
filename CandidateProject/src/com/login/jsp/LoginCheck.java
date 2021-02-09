package com.login.jsp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.login.bean.LoginBean;

public class LoginCheck {

	boolean status = false;

	public boolean Validate(LoginBean login) throws SQLException {

		try {
			DBConnection con = new DBConnection();
			Statement st = con.getDBConnection().createStatement();
			String sql="select * from userlogin where name='" + login.getName() + "' and pass='"+ login.getPassword() + "' ";
			ResultSet rs = st.executeQuery(sql);
			
			System.out.println(sql);
			status = rs.next();
			System.out.println(status);
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
