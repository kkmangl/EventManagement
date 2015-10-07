package com.sapient.model;

import java.awt.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class UserLogin {
	private String fname;
	public String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public ArrayList<String> name=new ArrayList<String>();
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public ArrayList<String> getName() {
		return name;
	}
	
	public boolean ValidateLogin(String username, String password ) {
		Context ctx=null;
		Connection con=null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		setUname(username);
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
			
			con = ds.getConnection();
			ps = con.prepareStatement("SELECT NAME FROM USERNAME WHERE (USERNAME=? OR EMAIL=?)  AND PASSWORD=?");
			ps.setString(1, username);
			ps.setString(2, username);
			ps.setString(3, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				uname=rs.getString(1);
				
				return true;
			}
			
			return true;
		} catch (NamingException e) {
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
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return false;
	}


}
