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

public class UpcomingEventList {
//	public ArrayList<String> ename=new ArrayList<String>();
//	public ArrayList<Date> edate=new ArrayList<Date>();
//	public ArrayList<String> evenue=new ArrayList<String>();
	
	public ArrayList<EventObject> eventList=new ArrayList<EventObject>();
	
	public ArrayList<EventObject> getEventList() {
		return eventList;
	}
	public boolean showList(String username) {
		Context ctx=null;
		Connection con=null;
		PreparedStatement ps =null;
		ResultSet rs = null;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/bankDB");
			con = ds.getConnection();
			ps = con.prepareStatement("SELECT EVENT.NAME,EVENT.EVENT_DATE,EVENT.VENUE,EVENT.EVENT_ID FROM EVENT WHERE EVENT.EVENT_ID NOT IN(SELECT TRANSACTION.EVENT_ID FROM TRANSACTION WHERE TRANSACTION.USERNAME=?)");
			ps.setString(1, username);
			rs = ps.executeQuery();
			if (rs.next()) {
				do {
					EventObject eob = new EventObject();
					String nameList=rs.getString(1);
					Date dateList=rs.getDate(2);
					String venueList=rs.getString(3);
					int eventId = rs.getInt(4);
					eob.setName(nameList);
					eob.setDate(dateList);
					eob.setVenue(venueList);
					eob.setEventId(eventId);
					
					eventList.add(eob);
				}while(rs.next());
				return true;
			}
			return false;
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
