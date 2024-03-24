package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HyperlinkServlet")
public class HyperlinkServlet extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
		
	    String username=request.getParameter("username");
	    String password=request.getParameter("password");
	    
	    PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		if(username.equals("Greeshma")&&password.equals("shailu@123"))
		{
			writer.println("Login sucessfull");
			writer.println("<a href='http://www.sathyatech.com'>Click here to open the sathya website</a>");

		}
		else
		{
			writer.println("Login Fail <br>");
			writer.println("<a href='http://www.sathyatech.com'>Click here to open the login page</a>");
			response.sendError(808,"Login Fail check the details once");
			
		}

	}
}