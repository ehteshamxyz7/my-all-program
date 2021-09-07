package com.hibernate.practice;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pagination.Student;

public class FetchDemo  {

	public static void main(String[] args) {
		//get,  load
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=factory.openSession();
		//get-student 103 
		
		  Student student=(Student)session.load(Student.class,105);
		  System.out.println(student);
		 
		
			/*
			 * Address ad=(Address)session.get(Address.class, 10);
			 * System.out.println(ad.getStreet()+" : "+ad.getCity();
			 */
		session.close();
		factory.close();
	}

}
