

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Prime
 */
@WebServlet("/Prime")
public class Prime extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Prime() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		List<Integer> primeList = new ArrayList<>();
		
		for (int i = 0; i < number; i++) {
			if (isPrime(i))
				primeList.add(i);
		}
		
		//response.sendRedirect("result.jsp");
		//out.println(primeList); 
		
		// pass object from servlet to jsp
		// https://www.programmergate.com/pass-data-servlet-jsp/
		request.setAttribute("primeList", primeList);
		request.getRequestDispatcher("primeResult.jsp").forward(request, response);
		
		out.close();
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
