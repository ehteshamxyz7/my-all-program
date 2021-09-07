package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
	Employee Emp = (Employee)context.getBean("Emp");
	
	System.out.println(Emp.getName());    
	System.out.println(Emp.getPhones());
	System.out.println(Emp.getAddresses());
	System.out.println(Emp.getCourses());
	
	}

}
