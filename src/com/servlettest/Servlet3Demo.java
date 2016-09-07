package com.servlettest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3Demo
 */
@WebServlet(name="Servlet3Demo", urlPatterns="/servlet3demo")
public class Servlet3Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public Servlet3Demo() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("Hello, https servlet, " + request.getAttribute("filter"));
	}

}
