package com.hibernate.oneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	private static final String Question = null;

	public static void main(String[] args) {
           
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		// creating question
		Question q1=new Question();
		q1.setQuestionId(900);
		q1.setQuestion("what is java ?");
		
		//creating answer
		Answer answer= new Answer();
		answer.setAnswerId(902);
		answer.setAnswer("java is programing languager");
		q1.setAnswer(answer);
		
		// creating question
				Question q2=new Question();
				q2.setQuestionId(901);
				q2.setQuestion("what is collection framework ?");
				
				//creating answer
				Answer answer1= new Answer();
				answer1.setAnswerId(903);
				answer1.setAnswer("Api to work with object in java");
				q2.setAnswer(answer1);
		
		
		
		//session
		
		Session s= factory.openSession();
	    Transaction tx= s.beginTransaction();
	    
	    //save
	    s.save(q1);
	    s.save(q2);
	    
	    s.save(answer);
	    s.save(answer1);
	    tx.commit();
	    
	    //fetching
	    Question newq=(Question) s.get(Question.class,900);
	    System.out.println(newq.getQuestion());
	    System.out.println(newq.getAnswer().getAnswer());
		
		s.close();
		
		factory.close();
	}

}
