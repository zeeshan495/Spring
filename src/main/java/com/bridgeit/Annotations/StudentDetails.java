package com.bridgeit.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class StudentDetails {
	private String name,id;
	
	
	@Autowired
	@Qualifier("studentAddress2")
	private StudentAddress studentAddress;

	public StudentDetails() {
		super();
		System.out.println("StudentDetails beanObject created");
	}


	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}
	@Required
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", id=" + id + ", studentAddress=" + studentAddress + "]";
	}
	


}
