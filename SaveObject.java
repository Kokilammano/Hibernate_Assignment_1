package com.hib_app.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hib_app.Employ;

public class SaveObject {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/hib_app/cfgs/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Employ employ=new Employ();
		employ.setId(102);
		employ.setName("Anu");
		employ.setMobile(887654332);
		employ.setEmail("anu@gmail.com");
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(employ);
			tx.commit();
			System.out.println("Successfully saved");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Failed");
		}
		session.close();
		factory.close();
	}
}
