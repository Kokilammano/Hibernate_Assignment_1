package com.hiberapp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiberapp.Prodts;

public class SaveObject {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("/com/hiberapp/cfgs/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Prodts prodts=new Prodts();
		prodts.setId(2);
		prodts.setName("Baloon");
		prodts.setPrice(60);
		prodts.setBrand("AirBaloon");
		
		Transaction tx=null;
		try {
			tx=session.beginTransaction();
			session.save(prodts);
			tx.commit();
			System.out.println("Successfully saved");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Failed" +e);
		}
		session.close();
		factory.close();
	}

}
