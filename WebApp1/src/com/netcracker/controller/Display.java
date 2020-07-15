package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class Display
 */
public class Display extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("fname");
		String password=request.getParameter("password");
		String[] hobby=request.getParameterValues("hobbies");
		String gender=request.getParameter("gender");
		String addr=request.getParameter("address");
		String city=request.getParameter("city");
		
		response.setContentType("text/html");// mime
		PrintWriter out=response.getWriter();
		
		out.println("Personal Details"+"<br>");
		out.println("---------------------"+"<br>");
		out.println("Name : "+name+"<br>");
		out.println("Password : "+password+"<br>");
		for(int i=0;i<hobby.length;i++) {
			out.println("Hobby : "+hobby[i]+"<br>");
		}
		
		out.println("Gender : "+gender+"<br>");
		out.println("Address : "+addr+"<br>");
		out.println("City : "+city+"<br>");
		
		
	}

}
