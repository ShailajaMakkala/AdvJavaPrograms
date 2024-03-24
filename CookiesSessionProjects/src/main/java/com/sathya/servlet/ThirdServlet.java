package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		Cookie[] cookie=request.getCookies();
		
		writer.println("<html>");
		writer.println("<body bgcolor='Green'>");
		writer.println("<pre>");
		writer.println("User UserName:"+cookie[0].getValue()+"<br><br>");
		writer.println("User Age:"+cookie[1].getValue()+"<br><br>");
		writer.println("User Qualification:"+cookie[2].getValue()+"<br><br>");
		writer.println("User Designation:"+cookie[3].getValue()+"<br><br>");
		writer.println("User Email Id:"+request.getParameter("email")+"<br><br>");
		writer.println("User Phone Number:"+request.getParameter("phoneno"));
		writer.println("<pre>");
		writer.println("<body>");
		writer.println("</html>");


	}

}
