package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//step:1 requested data
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		long mobile=Long.parseLong(request.getParameter("mobile"));
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String[] quals=request.getParameterValues("qualification");
		String country=request.getParameter("country");
		String[] lang=request.getParameterValues("language");
		String comments=request.getParameter("comments");
		
		//step:2 process the data
		String q =String.join(",", quals);
		String l=String.join(",", lang);
		
		//step:-3 render the responce
			response.setContentType("text/html");
		   PrintWriter writer=response.getWriter();
		   writer.println("<html>");
		   writer.println("<body bgcolor=blue>");
		   writer.println("User Name="+username+"<br><br>");
		   writer.println("Password="+password+"<br><br>");
		   writer.println("User Mobile="+mobile+"<br><br>");
		   writer.println("User Email="+email+"<br><br>");
		   writer.println("Gender="+gender+"<br><br>");
		   writer.println("Date Of Birth="+dob+"<br><br>");
		   writer.println("Qualification="+q+"<br><br>");
		   writer.println("country="+country+"<br><br>");
		   writer.println("Languages known="+l+"<br><br>");
		   writer.println("comments about Rathan sir="+comments+"<br><br>");
		   writer.println("</body>");
		   writer.println("</html>");

	

		   


		   


		   

		   
		   



}
}