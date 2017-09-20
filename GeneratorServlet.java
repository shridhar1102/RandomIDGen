package com.shridhar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GenID")
public class GeneratorServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out= response.getWriter();
		 String name1 = request.getParameter("name");
		 String age1 = request.getParameter("age");
		 
		 
		 String [] arr = {name1,age1};
		 Random r = new Random();
		 int select = r.nextInt(arr.length);
		
		 
          if(select == 0){
         out.print("Your id is : " + arr[select] + arr[1]);
          }
          else
        	  out.print("Your id is: "+ arr[select] + arr[0]);
		
		
	}
}
	
	