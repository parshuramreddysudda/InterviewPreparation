

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment3
 */
@WebServlet("/Assignment3")
public class Assignment3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn = null;
	PreparedStatement pstmt = null;
	
//	public Assignment3Servlet() {
//		conn = DBUtil.getConnection();
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		conn = DBUtil.getConnection();

		String sql = "INSERT INTO emp_test VALUES(?, ?, ?)";
		
//		if (conn == null)
//			out.println("conn is null");
//		else 
//			out.println("conn is not null");
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setInt(2, Integer.parseInt(request.getParameter("id")));
			pstmt.setString(3, request.getParameter("designation"));
			pstmt.executeUpdate();
			out.println("Success");
			request.setAttribute("result", "Success");
		} catch (SQLException e) {
			request.setAttribute("result", "Failed");
			out.println("Failed");
			e.printStackTrace();
		}
		
//		request.setAttribute("result", "Success");
		//out.print("test");
		
		//request.getRequestDispatcher("/assignment3.jsp").forward(request, response);
		
		out.close();
	}

}
