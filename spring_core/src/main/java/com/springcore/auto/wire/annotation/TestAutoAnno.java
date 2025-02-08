package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoAnno {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/autoannoconfig.xml");
		
//		Address address = (Address) context.getBean("address");
//		System.out.println(address);
		
		Emp emp = context.getBean("emp1", Emp.class);
		System.out.println(emp);
		
	}

}
