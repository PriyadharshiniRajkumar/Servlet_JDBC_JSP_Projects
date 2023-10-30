package com.maven.Dao;

import com.maven.model.Players;

import java.io.PrintWriter;
import java.sql.*;

public class PlayerDao {

	
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String uname = "sys as sysdba";
	String pass = "oracle";
	Connection con = null;

	
	

	public Players getPlayer(int pid) throws SQLException, ClassNotFoundException {
		
		
		// load the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// create the connection object
		 con = DriverManager.getConnection(url, uname, pass);
		String query = "select playerid,firstname, lastname, sports from player where playerid = " + pid;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		Players p = new Players();		

		if(rs.next()){		
		
		p.setPid(rs.getInt("playerid"));
		p.setFristname(rs.getString("firstname"));
		p.setLastname(rs.getString("lastname"));
		p.setSports(rs.getString("sports"));
		}	

		return p;

	}

	public int addPlayerData(Players p) throws ClassNotFoundException, SQLException {
		
		// load the driver class
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// create the connection object
				 con = DriverManager.getConnection(url, uname, pass);
				 
				 String query_id="select max(playerid)+1 from player";
				 String insert_q= "insert into player values(?,?,?,?)";
				 Statement st = con.createStatement();
				 ResultSet rs = st.executeQuery(query_id);	
				 int max_id =0;
				 if(rs.next())
					 max_id = rs.getInt(1);
				 
				PreparedStatement ps = con.prepareStatement(insert_q);
				ps.setInt(1, max_id);
				ps.setString(2, p.getFristname());
				ps.setString(3,p.getLastname());
				ps.setString(4, p.getSports());
				
				
				 ps.executeQuery();
				
				 return max_id;
		
	}
}
