package com.maven.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.Dao.PlayerDao;
import com.maven.model.Players;

/**
 * Servlet implementation class AddPlayerController
 */
public class AddPlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fristname=request.getParameter("fristname");
		String lastname=request.getParameter("lastname");
		String sports=request.getParameter("sports");
		
		
		Players p = new Players();
		p.setFristname(fristname);
		p.setLastname(lastname);
		p.setSports(sports);
		
		PlayerDao pd = new PlayerDao();
		
		try {
			PrintWriter pw = response.getWriter();
			pw.print(pd.addPlayerData(p)+"playerIs has been inserted!! ");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
