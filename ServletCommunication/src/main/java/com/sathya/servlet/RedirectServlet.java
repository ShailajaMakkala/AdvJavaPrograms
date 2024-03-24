package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
@WebServlet("/RedirectServlet")
public class RedirectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
	    
		if(username.equals("Greeshma")&&password.equals("shailu@123"))
		{
			response.sendRedirect("http://www.tcs.com");
			
		}
		else
		{
			
			response.sendError(808,"Login Fail check the details once");
			
		}

	}
}
