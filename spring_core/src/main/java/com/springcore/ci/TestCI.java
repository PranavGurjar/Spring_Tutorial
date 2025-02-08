package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		
		Person person = (Person) context.getBean("person");
		Addition add = (Addition) context.getBean("add");
		
//		person.toString();
		System.out.println(person);
		add.doSum();
		
	}
}
