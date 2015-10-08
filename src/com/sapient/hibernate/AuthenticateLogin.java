package com.sapient.hibernate;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.sapient.model.UserLoginInfo;


public class AuthenticateLogin {
	
	public boolean verifyUser(String username,String password)
	{
		SessionFactory factory;
        factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try{
        	System.out.println("Reporting ");
            tx = session.beginTransaction();
//            UserLoginInfo user=new UserLoginInfo();
           //Criteria criteria =session.createCriteria(UserLoginInfo.class);
           //List contacts=criteria.list();
           String SQL_Query="from UserLoginInfo as user where user.username=? and user.password=?";
           
           Query query=session.createQuery(SQL_Query);
           query.setParameter(0, username);
           query.setParameter(1, password);
           List list=query.list();
           if(list.size()>0)
           {
        	   return true;
           }
          return false;
        
          
}catch(HibernateException e){
            if(tx!=null){
                            tx.rollback();
            }
            e.printStackTrace();
}finally{
            session.close();
}
        return false;
        
	}

}
