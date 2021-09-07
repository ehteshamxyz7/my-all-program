package com.firstcache;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pagination.Student;

public class FirstDemo {
	
	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = f.openSession();

		Student student = (Student) s.get(Student.class, 1);
		System.out.println(student);
		
		System.out.println("Working something");
		
		Student student2 = (Student) s.get(Student.class, 1);
		System.out.println(student2);
		
		System.out.println(s.contains(student));
		
		
	
		
		
		s.close();
	}

}
