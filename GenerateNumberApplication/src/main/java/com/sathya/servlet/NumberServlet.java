package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int first=Integer.parseInt(request.getParameter("Range1"));
    	int second=Integer.parseInt(request.getParameter("Range2"));
    	String operation=request.getParameter("Operation");
    	
    	int a[]=new int[second-first];
    	
    	//2.process the data
    	int j=0,flag=0;
    	switch (operation)
    	{
		case "even" :for(int i=first;i<=second;i++)
                     {
			            if(i%2==0)
			            {
			            	a[j]=i;
			            	j++;
			            }
		             }
			         break;
		case "odd" :for(int i=first;i<=second;i++)
                    {
                        if(i%2!=0)
                         {
           	                 a[j]=i;
           	                 j++;
                         }
                     }			
	                 break;
		case "prime" :for(int i=first;i<=second;i++)
		              {
			              flag=0;
	                      for( int k=2;k<=i/2;k++)
	                      {
	                    	  if(i%k==0)
	                    	  {
	                    		  flag=1;
	                    		  break;
	                    	  }
	                      }
	                      if(flag==0)
	                      {
	                    	  a[j]=i;
	                    	  j++;
	                      }
		              }
	                  break;
		case "Strong" :	int Fact,k,Remainder,Sum=0;
			            for(int i=first;i<=second;i++)
                        {		
			            	int Temp=i;
			            	Sum=0;
			                 while( Temp > 0)
			                 {
				                  Fact = 1; 
				                  
			                      Remainder = Temp % 10;
			                      for(k=1;k<=Remainder;k++)
			                      {
			     	                   Fact = Fact * k;
			     	                  
			                      }
			                      Sum = Sum + Fact;
			                      Temp = Temp /10;
			                   }
			                 if(i == Sum)
			                 {
			                	 a[j]=i;
			                	 j++;
			                 }
			                 
                        }
		                break;
		case "Perfect" :int sum=0;
			            for(int i=first;i<=second;i++)
                        {
			                  sum=0;
	                          for(k=1;k<=i/2;k++)
	                          { 
	                             if(i%k==0)
	                                 sum=sum+k;

	                           }
	                           if(sum==i)
	                           {
	                               a[j]=i;
	                                j++;
	                           }
	        
	                  }
                        
	                     break;
	                     
    	}                
	  //3.Render the response
	   response.setContentType("text/html");
	   PrintWriter writer=response.getWriter();
	   writer.println("<html>");
	   writer.println("<body bgcolor=pink> </body>");
	   writer.println("<h1>calcualted Result</h1>");
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]>0)
	         writer.println(a[i]);
	   }

		
	}

}