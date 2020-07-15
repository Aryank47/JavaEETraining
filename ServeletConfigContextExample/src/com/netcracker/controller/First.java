package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String eid,num;

	/*
	 * public void init(ServletConfig config) throws ServletException { // TODO
	 * Auto-generated method stub eid=config.getInitParameter("emailid");
	 * //num=config.getInitParameter("contactnumber"); ServletContext
	 * sc=config.getServletContext(); num=sc.getInitParameter("contactnumber"); }
	 */

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig sc=this.getServletConfig();
		eid=sc.getInitParameter("emailid");
		ServletContext sc1=sc.getServletContext();
		num=sc1.getInitParameter("contactnumber");
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("init parameter from web.xml in First servelet is "+eid+"<br>");
		out.println("context parameter from web.xml in First servelet is "+num);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
