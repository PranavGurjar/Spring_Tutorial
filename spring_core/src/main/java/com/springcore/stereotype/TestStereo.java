package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		System.out.println("******************Student*******************");
//		singleton method
		Student student = context.getBean("student",Student.class);
		System.out.println(student.hashCode());
//		singleton method
		Student student1 = context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		
		
//		Student ab = context.getBean("ob",Student.class);
//		System.out.println(ab);
//		System.out.println(ab.getAddress());
//		System.out.println(ab.getAddress().getClass().getName());
		
		
		System.out.println("******************Teacher*******************");
		Teacher t1 = context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		
		Teacher t2 = context.getBean("teacher",Teacher.class);
		System.out.println(t2.hashCode());
		
	}
}
