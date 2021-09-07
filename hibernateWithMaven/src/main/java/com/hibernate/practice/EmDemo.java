package com.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hql.Certificate;
import com.pagination.Student;

public class EmDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Student student1=new Student();
		student1.setId(1234567);
		student1.setName("aamir");
		student1.setCity("sakinaka");
		
		Certificate certi1=new Certificate();
		certi1.setCourse("python");
		certi1.setDuration("3 month");
		
		student1.setCerti(certi1);
		Session s= factory.openSession();
		Transaction tx= s.beginTransaction();
		s.save(student1);
		
		
		tx.commit();
		s.close();
		factory.close();
		
	}

}
