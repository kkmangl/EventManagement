package com.sapient.model;

import java.util.Date;

public class NewEvent {
	private String eventName;
	private String vanue;
	private Date eventDate;
	private String description;
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getVanue() {
		return vanue;
	}
	public void setVanue(String vanue) {
		this.vanue = vanue;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
