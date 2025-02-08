package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student student = context.getBean("con",Student.class);
		System.out.println(student);
		student.study();
	}

}

//this following 3 method are use for in same work
//1. config.xml
//2. @ComponentScan
//3. @Bean