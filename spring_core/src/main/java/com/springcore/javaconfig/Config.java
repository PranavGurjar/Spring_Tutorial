package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")
public class Config {
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
//	when component annotation is not using then define it.
	@Bean(name = {"student","temp","con"})
	public Student beanStudent() {
//		create a new Student object
		Student student = new Student(getSamosa());
		
		return student;
	}

}
