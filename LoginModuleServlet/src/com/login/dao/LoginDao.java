package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class LoginDao {
	
	public boolean check(String uname, String pass){
		String query="select * from login where username=? and password=?";
		String url="jdbc:oracle:thin:@localhost:1521:orcl" ;
		String user="sys as sysdba";
		String password="oracle";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs=st.executeQuery();
			if(rs.next()){
				return true;
			}
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

}
