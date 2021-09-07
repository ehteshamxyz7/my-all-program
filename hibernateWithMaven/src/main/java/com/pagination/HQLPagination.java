package com.pagination;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPagination {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/pagination/hibernate/cfg.xml")
				.buildSessionFactory();

		Session s = factory.openSession();
		org.hibernate.Transaction transaction = s.beginTransaction();

		String q3 = "from Student";
		// implementing pagenation using hibernate
		Query createQuery = s.createQuery(q3);
		createQuery.setFirstResult(0);
		createQuery.setMaxResults(3);
		List<Student> list = createQuery.list();
		for (Student student : list) {
			System.out.println(student);
		}
		transaction.commit();
		s.close();
		factory.close();
	}

}
