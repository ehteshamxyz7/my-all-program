package com.states;


import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.Certificate;
import com.pagination.Student;


public class StateDemo {

	public static void main(String[] args){
		// practical of the hibernate object state
        //Transient state
	    //persistent state
		//detached state
		//removed state\
		
		System.out.println("Example :");
		
		SessionFactory factory = new Configuration().configure("com/states/hibernate.cfg.xml").buildSessionFactory();
		
		//Creating Student object:
		System.out.println(678);
		
		
		Student student=new Student();
		
		student.setName("Arshad");
		student.setCity("Powai");
		
		Certificate certificate=new Certificate();
		certificate.setCourse("SpringBoot");
		certificate.setDuration("2.5 month");
		
		student.setCerti(certificate);
		//Student Transient state
		Session session=factory.openSession();
		org.hibernate.Transaction transaction=session.beginTransaction();
		session.save(student);
		
		//session.save();
		//Student persistant    session-database 
		transaction.commit();
		factory.close();
	}
}
