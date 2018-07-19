package com.bridgeit.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;

public class Application {
	
	private Client client;

	// **auto wire by constructor
	public Application(Client client) {
		this.client = client;
	}
	
// **auto wire byName
//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}

	@Override
	public String toString() {
		return "Application [applicationuser=" + client + "]";
	}
	
}
