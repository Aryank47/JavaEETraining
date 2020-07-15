package com.netcracker.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		HttpSession mysession=request.getSession();//starting session for this request
		//mysession.setMaxInactiveInterval(5);
		String msg=null;
		int previsit=0;
		mysession.setAttribute("id", username);//session attribute
		if(mysession.isNew()) {
			msg="Welcome "+mysession.getAttribute("id");
		}
		else {
			msg="Welcome back "+mysession.getAttribute("id");
			previsit=(Integer)mysession.getAttribute("counter");
			previsit++;
		}
		mysession.setAttribute("counter", previsit);
		Date date=new Date(mysession.getCreationTime());
		out.println(date);
		
		out.println(msg+"<br><br><br><br>");
		out.println("<html><body bgcolor='red'><table border='5'>");
		
		out.println("<tr>");
		out.println("<td> Session ID</td><td>"+mysession.getId()+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> Number of previous visit</td><td>"+previsit+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> Session Creation Time</td><td>"+new Date(mysession.getCreationTime())+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td> Last Session Access time</td><td>"+new Date(mysession.getLastAccessedTime())+"</td>");
		out.println("</tr>");
		
		out.println("</table></body></html>");
		out.println("<a href='StopSession'>Logout</a>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
