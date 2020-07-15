package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netcracker.customexception.DatabaseException;
import com.netcracker.dto.User;
import com.netcracker.service.UserService;
import com.netcracker.service.UserServiceImpl;

/**
 * Servlet implementation class UserAuthentication
 */
public class UserAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService user;
	
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		user=new UserServiceImpl();
		
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * response.setContentType("text/html"); //PrintWriter
		 * out=response.getWriter(); 
		 * String username=request.getParameter("username");
		 * String password=request.getParameter("password");
		 * 
		 * out.println("<html><body bgcolor='orange'> ");
		 * 
		 * if(username.equals("aryan")&password.equals("ak")) {
		 * out.print("Welcome "+username); response.sendRedirect("LoginSuccess.html");
		 * }
		 *  else { //out.println("Please check the username or password");
		 * response.sendRedirect("LoginFailure.html"); }
		 * 
		 * out.println("</body></html>");
		 */
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User usr=new User(username,password);
		boolean flag=false;
		try {
			flag=user.Authentication(usr);
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag) {
			response.sendRedirect("LoginSuccess.html");
		}
		else {
			response.sendRedirect("LoginFailure.html"); 
		}
		
		
		
}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
