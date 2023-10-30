package com.servlet_jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class AddNumServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// req & res are Tomcat obj to send and receive req and res from serve
		// to client
		// and vice versa

		int i = Integer.parseInt(req.getParameter("num1")); // getPArameter is
															// used to return
															// String value
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;

		// PrintWriter out = res.getWriter();// Printing data on the response
		// obj from server to client
		// out.println("The result is : " + k);

		/*** Calling a servlet from one to another */
		// Session Management for sending Parameter from add servlet to square
		// servlet

		/**
		 * 1 -- RequestDispacter - Dispatching the request to sq
		 * req.setAttribute("k", k);setting attribute in req and passing to sq
		 * in RequestDispatcher RequestDispatcher rd =
		 * req.getRequestDispatcher("sq"); rd.forward(req, res);// Fowarding the
		 * obj req and res
		 */

		/**
		 * 2 SendRedirect --> informing client to go to sq servlet
		 * 
		 * // a) URL-Rewriting res.sendRedirect("sq?k="+k);
		 * 
		 * // b) Session Management - HttpSession HttpSession session =
		 * req.getSession(); session.setAttribute("k", k);
		 * res.sendRedirect("sq");
		 */
		//c)Cookie - Once the request received, response will be send to client with Cookies
		Cookie cookie = new Cookie("k",k+""); //Class accepts two parameter - both are strings, so converting k to string with(+"") appending
		res.addCookie(cookie);
		res.sendRedirect("sq");
	}
}
