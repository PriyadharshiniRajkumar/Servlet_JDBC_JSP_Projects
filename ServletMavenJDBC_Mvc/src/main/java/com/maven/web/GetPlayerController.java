package com.maven.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.Dao.PlayerDao;
import com.maven.model.Players;

public class GetPlayerController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		PlayerDao pd = new PlayerDao();
		Players p=new Players();
		
		
		try {
			p = pd.getPlayer(pid);
			request.setAttribute("players",p);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("showplayer.jsp");
		rd.forward(request, response);
		
	}

}
