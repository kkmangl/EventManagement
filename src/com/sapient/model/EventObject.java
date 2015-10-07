package com.sapient.model;

import java.util.Date;

public class EventObject {
	String name;
	String venue;
	Date date;
	int eventId;
	public String getName() {
		return name;
	}
	public void setName(String ename) {
		this.name = ename;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEventId() {
		return eventId;	
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

}
