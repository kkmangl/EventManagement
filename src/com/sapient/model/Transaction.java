package com.sapient.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
	@Id
	
	@Column(name="USERNAME",nullable=false)
	@NotEmpty
	private String username;
	
	@Column(name="EVENT_ID",nullable=false)
	@NotEmpty
	private int  event_id;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	

}
