package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestServlet")
public class RequestServlet extends HttpServlet
{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
	    
		if(username.equals("Greeshma")&&password.equals("shailu@123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("sucess.html");
			
			dispatcher.forward(request, response);
					
		}
		else
		{
			
		PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("Login Fail once check the credentials once");
		RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
		
		dispatcher.include(request, response);
				
		}

	}
}
