package com.wirpro.assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetMessage
 */
@WebServlet("/GreetMessage")
public class GreetMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat localDateFormat = new SimpleDateFormat("HH");
		String time = localDateFormat.format(new Date());
		int hour = Integer.parseInt(time);
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		if (hour < 12) {
			out.print("Good Morning  ");
		} else if (hour < 18 && hour > 11) {
			out.print("Good Afternoon  ");
		} else {
			out.print("Good Evening  ");
		}
		out.print(name);
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
