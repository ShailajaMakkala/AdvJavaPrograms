package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		HttpSession session =request.getSession(false);
		writer.println("<html>");
		writer.println("<body bgcolor='orange'>");
		writer.println("<pre>");
		writer.println("Username..: "+session.getAttribute("username")+"<br><br>");
		writer.println("Age...: "+session.getAttribute("age")+"<br><br>");
		writer.println("Qualification...: "+session.getAttribute("qualification")+"<br><br>");
		writer.println("Designation....: "+session.getAttribute("designation")+"<br><br>");
		writer.println("User Email: "+request.getParameter("email")+"<br><br>");
		writer.println("User Mobile: "+request.getParameter("phoneno")+"<br><br>");
		
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		}

}
	
