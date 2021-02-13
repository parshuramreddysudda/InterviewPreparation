package com.wipro.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.db.util.DBConnection;

/**
 * Servlet implementation class AddTraining
 */
@WebServlet("/AddTraining")
public class AddTraining extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddTraining() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String sDate = request.getParameter("sDate");
		String eDate = request.getParameter("eDate");
		String mode = request.getParameter("mode");
		String unit = request.getParameter("unit");
		String pId = request.getParameter("pId");

		DBConnection db = new DBConnection();
		try {
			Statement st = DBConnection.getDBConnection().createStatement();
			String sql = "INSERT INTO training VALUES ('" + id + "','" + name + "','" + sDate + "','" + eDate + "','"
					+ mode + "','" + unit + "','" + pId + "')";
			st.executeUpdate(sql);
			PrintWriter out = response.getWriter();
			out.print("Inserted into the database.");
//			response.sendRedirect("Admin.html");
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
