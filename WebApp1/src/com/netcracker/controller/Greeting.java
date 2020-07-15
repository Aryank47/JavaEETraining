package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Greeting extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Greetings");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Greetings Destroyed");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String msg=request.getParameter("gm");
		response.setContentType("text/html");// mime
		PrintWriter out=response.getWriter();
		
		out.println("Client says:"+msg);
	}

}
