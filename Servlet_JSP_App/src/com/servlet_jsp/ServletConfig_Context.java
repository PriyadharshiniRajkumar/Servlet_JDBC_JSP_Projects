package com.servlet_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfig_Context extends HttpServlet {


protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

	PrintWriter out = res.getWriter();
	out.println("Hi <br/>");
	
	/**ServletContext - sharing same data value with other Servlet
	ServletContext sctx = getServletContext();
	String str = sctx.getInitParameter("Name");
	out.println(str);
	*/
	/*ServletConfig - Each servlet is having its each init value*/
	ServletConfig sctx = getServletConfig();
	String str = sctx.getInitParameter("Name");
	out.println(str);
}

}