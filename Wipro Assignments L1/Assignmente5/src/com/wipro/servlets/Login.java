package com.wipro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.util.DBConnection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.print(getServletContext().getInitParameter("AdministratorEmail"));
		String ClassName=getServletContext().getInitParameter("ClassName");
		String Url=getServletContext().getInitParameter("Url");
		String Username=getServletContext().getInitParameter("Username");
		String Password=getServletContext().getInitParameter("Password");
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		DBConnection con = new DBConnection();
		try {
			Statement st = DBConnection.getDBConnection(ClassName, Url, Username, Password).createStatement();
			String sql = "select type from userlogin where name='" + user + "' and pass='" + pass + "' ";
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				if (rs.getString("type").equalsIgnoreCase("A")) {
					response.sendRedirect("Admin.html");

				}else {
					response.sendRedirect("User.html");

				}
			} else {
				response.sendRedirect("Error.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}