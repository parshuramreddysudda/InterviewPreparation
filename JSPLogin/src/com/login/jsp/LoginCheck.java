package com.login.jsp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.bean.LoginBean;

public class LoginCheck {

	public boolean status = false;

	public boolean Validate(LoginBean login) throws SQLException {

		try {
			DBConnection con = new DBConnection();
			PreparedStatement ps = con.getDBConnection()
					.prepareStatement("select * from userlogin where username= ? and password= ? ");
			ps.setString(1, login.getName());
			ps.setString(2, login.getPassword());

			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

}
