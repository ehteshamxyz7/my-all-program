package com.hql;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pagination.Student;

public class HQLExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		String query = "from Student where city = 'Powai'";
		Query q = session.createQuery(query);

		// single -unique
		// multiple-list

		// createQuery.uniqueResult();
		System.out.println("___________________________");
		List<Student> list = q.list();

		for (Student s : list) {
			System.out.println(s.getName() + " : " + s.getCerti().getCourse());

			System.out.println("_____________________________________");
			
			//Example of HQL delete query
			 /* org.hibernate.Transaction tx= session.beginTransaction();
			 * 
			 * Query query1=session.createQuery("delete from Student where city = 'Mumbai'");
			   query1.executeUpdate();*/
			
			
			////Example of HQL update query
			
			  org.hibernate.Transaction transaction = session.beginTransaction(); Query
			  q1=session.createQuery("update Student set name=:n where id=:i");
			  q1.setParameter("n","Sakib"); q1.setParameter("i",4);
			  
			  int status=q1.executeUpdate();
			  System.out.println(status+"Update successfull");
			 transaction.commit();
			
			//how to excute join  query
			  Query q2 = session.createQuery("Select q.question, q.questionId,a.answer from Question as q INNER JOIN q.answer as a");
			 
			
			session.close();
			factory.close();
		}
	}
}
