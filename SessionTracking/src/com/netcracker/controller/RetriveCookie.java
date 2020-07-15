package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetriveCookie
 */
public class RetriveCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String token=request.getParameter("id");
		Cookie all[]=request.getCookies();
		if(all!=null) {
			for(Cookie e:all) {
				if(e.getName().equals("nc")) {
					String cValue=e.getValue();
					if(token.equals(cValue)) {
						out.println("Welcome "+token+" Nice to see you again!!");
					}
					else {
						out.println(token+" login first you fucker.");
					}
				}
			}
		}
		else {
			out.println("No cookie found on client side");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
