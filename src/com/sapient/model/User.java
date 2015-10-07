package com.sapient.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class User {
	String Name;
	String email;
	String password;
	static int counter=1;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean addUser(String Username,String name,String email,String password) throws NamingException
	{
		Context ctx= null;
		Connection con=null;
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		try {
			ctx= new InitialContext();
		DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
			 con=ds.getConnection();
			ps1=con.prepareStatement("select * from username where username=?");
			ps1.setString(1, Username);
			ResultSet result=ps1.executeQuery();
			if(result.next())
			{
				
				return false;
			}
			ps=con.prepareStatement("insert into username(username,name,email,password) values(?,?,?,?)");
			ps.setString(1, Username);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, password);
			ps.executeUpdate();
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				if(ctx!=null)
				{
					ctx.close();
				}
				if(con!=null)
				{
					con.close();;
				}
				if(ps!=null)
				{
					ps.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return true;
	}

}
