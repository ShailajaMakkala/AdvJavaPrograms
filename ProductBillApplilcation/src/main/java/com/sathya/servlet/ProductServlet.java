package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	
   
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		//step1:Read the requested data
		
		int proId=Integer.parseInt(request.getParameter("proId"));
		String proName=request.getParameter("proName");
		double proPrice= Double.parseDouble(request.getParameter("proPrice"));
		int proQuantity =Integer.parseInt(request.getParameter("proQuantity"));
		
	    //step:2 process the data
		
		
		double totalbill=proPrice*proQuantity;
		double discount,net_amt;
		if(totalbill>1000) 
			discount=0;
		
		 else if(totalbill>1000 	&& totalbill<5000)
			discount=0.05*totalbill;
			
		 else if(totalbill> 5000 && totalbill<10000)
				discount=0.1*totalbill;
			
		 else
			discount=0.15*totalbill;
			
		net_amt=totalbill-discount;
		
		
		//step;3 render the responce
		
		response.setContentType("text/html");
		PrintWriter writer =response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor=pink>");
		writer.println("<h1>Product Bill Invoice</h1>");
		writer.println("product ID="+proId+"<br><br>");
		writer.println("product Name="+proName+"<br><br>");
		writer.println("product price=$"+proPrice+"<br><br>");
		writer.println("product Quantity="+proQuantity+"<br><br>");
		writer.println("Total bill Amount="+totalbill+"<br><br>");
		writer.println("Discount Amount="+discount+"<br><br>");
		writer.println("Net Amount to Pay="+net_amt+"<br><br>");
		writer.println("</body>");
		writer.println("</html>");
	
	
	
	
	}

}
