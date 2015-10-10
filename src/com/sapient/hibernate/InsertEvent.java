package com.sapient.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class InsertEvent {
	public void insertEvent(int eventid,String username)
	{
		SessionFactory factory;
        factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            com.sapient.model.Transaction trans=new com.sapient.model.Transaction();
            trans.setEvent_id(eventid);
            trans.setUsername(username);
            session.save(trans);
            
            
            tx.commit();
        }catch(HibernateException e)
        {
        	e.printStackTrace();
        }finally{
        	session.close();
        	factory.close();
        }
	}

}
