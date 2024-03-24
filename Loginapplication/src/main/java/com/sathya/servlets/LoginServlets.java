package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlets")

public class LoginServlets extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    
	String status;
	if(username.equals("Greeshma")&&password.equals("shailu@123"))
	{
		status="login sucessfull..";
				
	}
	else
	{
		status="login failed";
	}
	// step-3 render the response
	PrintWriter writer =response.getWriter();
	response.setContentType("text/html");
	writer.println("<html>");
	writer.println("<h1>Login status...</h1>"+status);
	writer.println("</html>");
	
	
		}

}
