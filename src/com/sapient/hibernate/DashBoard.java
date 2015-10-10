package com.sapient.hibernate;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DashBoard {
	public List dashList(String username) {
		
		SessionFactory factory;
        factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
        	tx = session.beginTransaction();
        	String SQL_Query=" FROM Event as eve WHERE eve.eventid IN(SELECT transact.event_id FROM Transaction as transact WHERE transact.username=?)";
        	Query query=session.createQuery(SQL_Query);
        	query.setParameter(0, username);
        	List eventlist=query.list();
        	return eventlist;
        	
        }catch(HibernateException e){
        	e.printStackTrace();
        }
        finally{
        	session.close();
        }
        return null;
	}
}

