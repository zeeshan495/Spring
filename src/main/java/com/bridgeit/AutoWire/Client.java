package com.bridgeit.AutoWire;

public class Client {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ApplicatonUser [name=" + name + "]";
	}

}
