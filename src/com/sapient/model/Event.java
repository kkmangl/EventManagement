package com.sapient.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table ( name = "EVENT")
public class Event {
	
	@Column(name = "NAME",nullable=false)
	@NotEmpty
	private String name;
	
	@Column(name = "EVENT_ID",nullable=false)
	@NotEmpty
	@Id
	@GeneratedValue
	private String eventid;
	
	@Column(name = "EVENT_DATE",nullable=false)
	@NotEmpty
	private Date eventdate;
	
	@Column(name = "VENUE",nullable=false)
	@NotEmpty
	private String venue;
	
	@Column(name = "DESCRIPTION",nullable=true)
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEventid() {
		return eventid;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}

	public Date getEventdate() {
		return eventdate;
	}

	public void setEventdate(Date eventdate) {
		this.eventdate = eventdate;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
