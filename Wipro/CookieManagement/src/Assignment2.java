

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
       
       Cookie[] cookie=request.getCookies();
       if(cookie!=null) {
    	   
    	   pw.println("<h1> List of Cookies");
    	   pw.println("<table border=1");
    	   for (int i = 0; i < cookie.length; i++) {
				pw.println("<tr>");
				pw.println("<td>" + cookie[i].getName() + "</td>");
				pw.println("<td>" + cookie[i].getValue() + "</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
		} else {
			pw.println("No Cookies");
		}
       }
}
