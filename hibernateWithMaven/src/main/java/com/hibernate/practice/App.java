package com.hibernate.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pagination.Student;

public class App {
	public static void main(String[] args) {

		System.out.println("project started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// creating student
		Student st = new Student();
		st.setId(111);
		st.setName("aamir");
		st.setCity(" saki naka");

		System.out.println(st);
		
		//creating address of object class
		Address ad= new Address();
		ad.setStreet("street1");
		ad.setCity("Mumbai");
		ad.setOpen(true);
        ad.setAddedDate(new Date());
		ad.setX(12345.54321);
		
		/*
		 * //reading image FileInputStream file= new
		 * FileInputStream("src/main/java/img.jpg"); byte[] data = new
		 * byte[file.available()];
		 * 
		 * file.read(); ad.setImage(data)
		 */;
		

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();

		session.close();
		System.out.println("Done............");

	}
}
