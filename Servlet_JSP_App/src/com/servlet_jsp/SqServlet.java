package com.servlet_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		/**
		 * Calling one servlet to another by passing parameters
		 * 
		 * 1 )Request Dispatcher implementation part
		 * 
		 * //getting the add Servlet parameter through attribute int k = (int)
		 * req.getAttribute("k"); k=k*k; PrintWriter out = res.getWriter();
		 * out.println("Squaring the number using RequestDispachter : "+k);
		 * 
		 * 2 )SendRedirect concepet ex a) URL-Rewriting int k
		 * =Integer.parseInt(req.getParameter("k")); k=k*k; PrintWriter out =
		 * res.getWriter(); out.println("Squaring the number URL-Rewriting :
		 * "+k);
		 * 
		 * b)Using HttpSession
		 * 
		 * HttpSession session = req.getSession(); int k = (int)
		 * session.getAttribute("k"); k = k * k; PrintWriter out =
		 * res.getWriter(); out.println("Squaring the number - HttpSession : " +
		 * k);
		 *  */
		//c) Using Cookie 
		int k = 0;
		Cookie cookies[] = req.getCookies();
		//Client will send all Cookies, we need to find our req Cookie for
		for(Cookie c: cookies) {
		  if (c.getName().equals("k")) {
		    k =
		      Integer.parseInt(c.getValue());
		  }
		}
		k = k * k;
		PrintWriter out =
		  res.getWriter();
		out.println("Squaring the number - Cookies : " + k);
		

	}
}
