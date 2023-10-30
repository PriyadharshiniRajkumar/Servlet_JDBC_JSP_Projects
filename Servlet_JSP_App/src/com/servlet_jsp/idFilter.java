package com.servlet_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

//Filter name should be equal to Servlet name
@WebFilter("/JSTL_Demo")
public class idFilter implements Filter {
  
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("In fliter");
		PrintWriter out = response.getWriter();
		HttpServletRequest req= (HttpServletRequest) request; //Typecasting to HttpServlet obj
		int id= Integer.parseInt(request.getParameter("id"));
		
		//Filter applying on ID, to be greater than one
		if(id>1)
		chain.doFilter(request, response);
		else
			out.print("The ID should be greater than 1");
	}

	
	
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
