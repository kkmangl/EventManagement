package com.sapient.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class EventModel {
	static public int counter=2;
	public boolean addEvent(String name,String event_date,String venue,String description) throws NamingException, ParseException
	{
		Context ctx= null;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			 ctx= new InitialContext();
		     DataSource ds=(DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
			 con=ds.getConnection();
			
              /*converting string to Date*/
			  DateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
              java.sql.Date d = new java.sql.Date(format.parse(event_date).getTime());

			//Integer m=100*counter;
			//String s=m.toString();
			 counter++;
			 Integer s=counter;
			 String s1=s.toString();
			 //java.util.Date date=new SimpleDateFormat("yyyy-MM-dd").parse(event_date);
			 ps=con.prepareStatement("insert into event(name,event_id,event_date,venue,description) values(?,?,?,?,?)");
			 ps.setString(1,name);
			 ps.setString(2, s1);
			 ps.setDate(3, (java.sql.Date)d);
			 ps.setString(4, venue);
			 ps.setString(5, description);
			 
			 ps.executeUpdate();
			//counter++;
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