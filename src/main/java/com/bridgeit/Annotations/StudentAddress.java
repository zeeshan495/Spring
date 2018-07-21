package com.bridgeit.Annotations;

public class StudentAddress {
	private String location;

	public StudentAddress() {
		super();
		System.out.println("StudentAddress beanObject created");
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "StudentAddress [location=" + location + "]";
	}

}
