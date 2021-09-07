package com.hibernate.manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args)  {
      
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory = con.buildSessionFactory();
				
		Emp emp= new Emp();
		Emp emp2 = new Emp();
		
		emp.setEmpId(10);
		emp.setEmpname("Ehtesham Alam");
		
		emp2.setEmpId(20);
		emp2.setEmpname("Aamir khan");
		
		Project project= new Project();
		Project project2= new Project();

		project.setpId(30);
		project.setProjectName("Library management system");
		
		project2.setpId(40);
		project2.setProjectName("Sppu Exam portal");
		
		List<Emp> empList=new ArrayList<Emp>();
		List<Project> projectList= new ArrayList<Project>();
		
		empList.add(emp);
		empList.add(emp2);
		
		projectList.add(project);
		projectList.add(project2);
		
		emp.setProjects(projectList);
		emp2.setProjects(projectList);
		
		project.setEmp(empList);
		project2.setEmp(empList);
		
		
		Session session =factory.openSession();
		org.hibernate.Transaction tx= session.beginTransaction();
				
		
		session.save(emp);
		session.save(emp2);
		session.save(project);
		session.save(project2);
		
		tx.commit();
		
		session.close();  
		factory.close();
	}

}
