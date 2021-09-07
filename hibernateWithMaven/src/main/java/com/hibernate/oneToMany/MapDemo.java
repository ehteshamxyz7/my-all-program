package com.hibernate.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/hibernate/oneToMany/hibernate.cfg.xml")
				.buildSessionFactory();

		// creating question

		/*
		 * Question11 question = new Question11();
		 * question.setQuestion("what is java ?");
		 * 
		 * Answer11 answer = new Answer11();
		 * answer.setAnswer("java is programing languager");
		 * answer.setQuestion(question);
		 * 
		 * Answer11 answer1 = new Answer11();
		 * answer1.setAnswer("with the help of java we can create softwere");
		 * answer1.setQuestion(question);
		 * 
		 * Answer11 answer2 = new Answer11();
		 * answer2.setAnswer("java is a type of framework");
		 * answer2.setQuestion(question);
		 * 
		 * List<Answer11> list = new ArrayList<Answer11>(); list.add(answer);
		 * list.add(answer1); list.add(answer2);
		 * 
		 * question.setAnswer(list);
		 */
		// session

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		/* session.save(question); */

		/*
		 * Session session = factory.openSession();
		 * 
		 * Transaction transaction = session.beginTransaction();
		 */
          
		Question11 q=(Question11) session.get(Question11.class,1);
		System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		
		
		 

		transaction.commit();

		session.close();

		factory.close();
		System.out.println("created...........");
	}

}
