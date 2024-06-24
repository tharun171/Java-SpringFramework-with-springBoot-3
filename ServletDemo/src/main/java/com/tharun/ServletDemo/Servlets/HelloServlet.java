package com.tharun.ServletDemo.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	
	private static final long serialVersionUID = 1L;
	
	//instead of service we can have names based on operations
	//doGet, doPost
	public void doGet(HttpServletRequest req,
			HttpServletResponse res) throws IOException
	{
		System.out.println("in Service");
		
		//To write on page with api /hello for this HelloServlet
		//res.getWriter().println("Inside hello page");
		
		//To write data on server
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h2>In Hello Page</h2>");
	}

}
