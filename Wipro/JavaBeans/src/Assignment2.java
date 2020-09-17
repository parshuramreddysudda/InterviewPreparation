

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment2
 */
@WebServlet("/Assignment2")
public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		int num=Integer.parseInt(request.getParameter("number"));
		request.setAttribute("number", num);
		if(num<10) {
			request.getRequestDispatcher("page1.jsp").forward(request, response);
		}
		else if(num>10&&num<99) {
			request.getRequestDispatcher("page2.jsp").forward(request, response);
		}
		else {
		request.getRequestDispatcher("error.jsp").forward(request, response);	
		}
		pw.close();
		
	}


}
