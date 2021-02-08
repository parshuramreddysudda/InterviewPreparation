package com.wipro.servelst;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HitCounter
 */
@WebServlet("/HitCounter")
public class HitCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HitCounter() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int count = 0;
		Cookie cookie[] = request.getCookies();
		if (cookie != null)
			for (Cookie cook : cookie) {
				if (cook.getName().equals("counter")) {
					count = Integer.valueOf(cook.getValue());
				}
			}
		count++;
		Cookie c = new Cookie("counter", String.valueOf(count));
		c.setMaxAge(5 * 60);
		response.addCookie(c);
		PrintWriter out = response.getWriter();
		if (count == 1) {
			out.print("New User");
		} else {
			out.print("Old user, count is " + count);
		}
	}

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("user");
		String pass = request.getParameter("pass");
		if (uname.equals(pass)) {
			HttpSession session=request.getSession();
			session.setAttribute("username", uname);
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/HomePage");
			rd.forward(request, response);
		}
		response.getWriter().append("Invalid DEtails");
		RequestDispatcher rd=getServletContext().getRequestDispatcher("/HomePage");
		rd.include(request, response);
	}

}
