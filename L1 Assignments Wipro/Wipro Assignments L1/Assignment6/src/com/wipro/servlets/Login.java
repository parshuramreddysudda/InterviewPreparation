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
import javax.servlet.http.HttpSession;

import com.db.util.DBConnection;
import com.mysql.cj.xdevapi.SessionFactory;

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
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		DBConnection con = new DBConnection();
		try {
			Statement st = DBConnection.getDBConnection().createStatement();
			String sql = "select type from userlogin where name='" + user + "' and pass='" + pass + "' ";
			ResultSet rs = st.executeQuery(sql);
			HttpSession ses = request.getSession();
			System.out.println("Username is "+user);
			if (rs.next()) {
				if (rs.getString("type").equalsIgnoreCase("A")) {
					ses.setAttribute("name", user);
					request.getRequestDispatcher("Display.jsp").forward(request, response);
				} else {
					ses.setAttribute("name", user);
					request.getRequestDispatcher("Display.jsp").forward(request, response);
				}
			} else {
				ses.setAttribute("name", user);
				request.getRequestDispatcher("Display.jsp").forward(request, response);
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
