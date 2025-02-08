package com.springcore.javaconfig;



// Component annotation is define in Config.java file
//@Component
public class Student {
//	@Value("#{new String('Pranav Mahajan')}")
//	private String name;
//
//	@Override
//	public String toString() {
//		return "Student [name=" + name + "]";
//	}
//	
	private Samosa samosa;
	
	
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	

//	@Override
//	public String toString() {
//		return "Student [samosa=" + samosa + "]";
//	}


	public void study() {
		this.samosa.display();
		System.out.println("Student is reading and writing");
	}
	
}
