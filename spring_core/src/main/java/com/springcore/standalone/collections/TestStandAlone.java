package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandAlone {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person person1 = context.getBean("p1", Person.class);
		System.out.println(person1);
		
		System.out.println("*****************************************************");
		System.out.println(person1.getFriends());
		System.out.println(person1.getFriends().getClass().getName());
		
		System.out.println("*****************************************************");
		System.out.println(person1.getFeesStructure());
		System.out.println(person1.getFeesStructure().getClass().getName());
		
		System.out.println("*****************************************************");
		System.out.println(person1.getProperties());
		System.out.println(person1.getProperties().getClass().getName());
		
//		Person person2 = context.getBean("p2", Person.class);
//		System.out.println(person2);
//		System.out.println(person2.getFriends().getClass().getName());
	}
}
