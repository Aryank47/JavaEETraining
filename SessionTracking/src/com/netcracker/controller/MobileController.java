package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MobileController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String eid=request.getParameter("id");
		out.println("<html><body bgcolor='red'>");
		out.println("Welcome "+username+" to online mobile shopping<br>");
		out.println("Please Select a Brand <br><br><br><br>");
		out.println("<a href='BookShopping.jsp?myuser="+username+"&empid="+eid+"'>ClickHereForBookShopping</a>");
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
