package com.wipro.newfilter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class PassThrough
 */
@WebFilter(
		urlPatterns= {"/welcome","/SecondServlet"},
		initParams= {
				@WebInitParam(name="type",value="admin")
		}
		)
public class PassThrough implements Filter {
	FilterConfig config;

	/**
	 * Default constructor.
	 */
	public PassThrough() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.print(config.getInitParameter("value"));
		out.print("Preprocessing through filter ");
		chain.doFilter(request, response);
		out.print("  Post afterPreprocessing through filter ");
		out.println("</body></html>");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config=fConfig;
	}

}
