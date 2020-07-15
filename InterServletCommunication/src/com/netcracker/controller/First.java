package com.netcracker.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int x=Integer.parseInt(request.getParameter("num1"));
		int y=Integer.parseInt(request.getParameter("num2"));
		int sum=x+y;
		
		HttpSession mysession=request.getSession();
		RequestDispatcher link=request.getRequestDispatcher("Max.jsp");
		RequestDispatcher link1=request.getRequestDispatcher("Min.jsp");
		
		if(sum>1000) {
			mysession.setAttribute("result", sum);//setting attribute
			link.forward(request, response);//control will be shifted to second
			
		}
		else {
			//out.println("response from first servlet "+sum);
			ServletContext sc=this.getServletContext();
			sc.setAttribute("result", sum);
			link1.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
