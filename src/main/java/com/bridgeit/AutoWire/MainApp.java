package com.bridgeit.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("AutoWire.xml"); 
		Application app=(Application)context.getBean("application");	
		System.out.println(app);
		context.close();
	}

}
