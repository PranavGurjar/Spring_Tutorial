package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		
		Address address = (Address) context.getBean("address");
		System.out.println(address);
		
		Emp emp = context.getBean("emp1", Emp.class);
		System.out.println(emp);
		
	}

}
