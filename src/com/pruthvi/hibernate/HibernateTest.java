package com.pruthvi.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pruthvi.dto.Userdetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		Userdetails u = new Userdetails();
		u.setUserId(4);
		u.setName("PSP1");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		
	}

}
