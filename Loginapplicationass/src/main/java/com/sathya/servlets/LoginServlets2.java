package com.sathya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlets2")
public class LoginServlets2 extends HttpServlet {
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step-1 Read the  form data
		
		String  firstname=request.getParameter("firstname");
	    String middlename=request.getParameter("middlename");
	    String lastname=request.getParameter("lastname");
	    
	    //process the data
	    String status;
	    if(firstname.equals("Shailu")&&middlename.equals("Greeshma")&&lastname.equals("Prashanth"))
	    {
	    	status=firstname+" "+middlename+" "+lastname;
	    }
	    else
	    {
	    	status="login failed...";
	    }
	    
	    //render the responce
	
	    PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Your Fullname</h1>"+status);
		writer.println("</html>");
	}

}
