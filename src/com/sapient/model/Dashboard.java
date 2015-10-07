package com.sapient.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Dashboard {
//	public ArrayList<String> name=new ArrayList<String>();
//	public ArrayList<String> venue=new ArrayList<String>();
//	public ArrayList<Date> date=new ArrayList<Date>();
	public ArrayList<Dashobject> eventlist=new ArrayList<Dashobject>();
//	public ArrayList<String> getName() {
//		return name;
//	}
//	public ArrayList<String> getVenue() {
//		return venue;
//	}
//	public ArrayList<Date> getDate() {
//		return date;
//	}
	public ArrayList<Dashobject> getEventlist()
	{
		return eventlist;
	}
	public boolean getEvents(String username)
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
			ps = con.prepareStatement("SELECT EVENT.NAME,EVENT.EVENT_DATE,EVENT.VENUE FROM EVENT where event.event_id in (select transaction.event_id from  transaction where transaction.username=?)");
		ps.setString(1, username);
			rs = ps.executeQuery();
			String n;
			String v;
			Date d;
			
			if(rs.next())
			 {
				do{
				Dashobject dob=new Dashobject();
				n=rs.getString(1);
				System.out.println(n);
				v=rs.getString(3);
				System.out.println(v);
				d=rs.getDate(2);
				dob.setDate(d);
				dob.setName(n);
				dob.setVenue(v);
				
				eventlist.add(dob);
//				name.add(n);
//				venue.add(v);
//				date.add(d);
				
				
			}while (rs.next());

			
			return true;
		}
		else
		{
			return false;
		}
			
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
				}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return false;
	}

}
