package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 //step1:get requested data
		int a=Integer.parseInt(request.getParameter("first"));
		int b=Integer.parseInt(request.getParameter("second"));
		String operation=request.getParameter("operation");
		
		
		//step2:-process the data
		int result=0;
		switch(operation)
		{
		case "+" : result=a=b;
				break;
		case "-" : result=a=b;
				break;
		case "*" : result=a=b;
				break;	
		case "/" : result=a=b;
				break;
		case "%" : result=a=b;
				break;
		}
		//step3:render the responce
		
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h1>Calculation Result</h1>");
		writer.println("Fist Number="+a+"<br><br>");
		writer.println("Second Number="+b+"<br><br>");
		writer.println("Operation Type="+operation+"<br><br>");
		writer.println("Result="+result+"<br><br>");
		
		writer.println("</body>");
		writer.println("</html>");
	
	
	
	}

}
