package com.servlet_jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTL_Demo")
public class JSTL_Demo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int id= Integer.parseInt(request.getParameter("id"));
		
		out.println("The name of the employee is "+name+" thier id is : "+id);
		
		/*JSTL Core
		 * List <Students> studs = Arrays.asList(new Students(1, "Amulu"),new Students(2, "Priya"));
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);*/
	}



}
