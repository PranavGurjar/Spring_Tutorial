package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLC {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lc_config.xml");
		
		Samosa samosa = (Samosa) context.getBean("s1");
		System.out.println(samosa);
		
		Pepsi pepsi = (Pepsi) context.getBean("p1");
		System.out.println(pepsi);

		Example eg = (Example) context.getBean("eg");
		System.out.println(eg);
		
		context.registerShutdownHook();
	}
}
