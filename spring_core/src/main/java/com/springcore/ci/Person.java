package com.springcore.ci;

import java.util.List;

public class Person {
    private int personID;
    private String name;
    private Certi certi;
    private List<String> list;
    

    public Person() {
		super();
	}

	// Constructor that matches the XML configuration
    public Person(int personID, String name, Certi certi, List<String> list) {
        this.personID = personID;
        this.name = name;
        this.certi = certi;
        this.list=list;
    }

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCerti(Certi certi) {
		this.certi = certi;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
    public String toString() {
        return "Person [personID=" + personID + ", name=" + name + ", certi=" + certi + ", list=" + list + "]";
    }

}
