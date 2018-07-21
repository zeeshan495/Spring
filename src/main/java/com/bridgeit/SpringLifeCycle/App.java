package com.bridgeit.SpringLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("\n***ApplicationContext is loaded***"
				+ "\nCentral interface to provide configuration for an application."
				+ "\nThis is read-only while the application is running and it provides bean factory methods");

		HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld1");
		// HelloWorld obj2=(HelloWorld) context.getBean("helloWorld2");
		obj1.getMessage1();
		// obj2.getMessage2();
		context.close();

	}

}
