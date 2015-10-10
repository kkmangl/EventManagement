package com.sapient.hibernate;

import java.util.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.sapient.model.Event;

public class AddEvent {

	public static boolean add(Event event){
		
		
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(event);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		return true;
	}
	
}
