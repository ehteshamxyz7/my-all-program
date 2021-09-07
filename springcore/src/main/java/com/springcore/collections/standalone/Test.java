package com.springcore.collections.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/springcore/collections/standalone/aloneconfig.xml");
	Person person1  = (Person) ap.getBean("person1");
		System.out.println(person1);
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("-------------------------------------------------");
		System.out.println(person1.getFeestructure());
		System.out.println(person1.getFeestructure().getClass().getName());
		System.out.println("-------------------------------------------------");
		System.out.println(person1.getProps());
				
}
}