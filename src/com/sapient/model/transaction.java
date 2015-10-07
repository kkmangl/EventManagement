package com.sapient.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class transaction {
	public boolean addEvent(String[] events,String username)
	{
		Context ctx=null;
		Connection con=null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
			System.out.println(username);
			con = ds.getConnection();
			for(String e_id:events)
			{
				ps = con.prepareStatement("insert into transaction(username,event_id) values(?,?)");
			ps.setString(1, username);
			ps.setString(2, e_id);
			ps.executeUpdate();
			}		
			return true;
		}
		
			
		 catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if (ctx!=null) {
					ctx.close();
				}
				if (con!=null) {
					con.close();
				}
				if (ps!=null) {
					ps.close();
				}
				if (rs!=null) {
					rs.close();
				}
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	
		
		return true;
	}

}
