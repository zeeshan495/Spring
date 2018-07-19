package com.bridgeit.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		 ApplicationContext context=new	 ClassPathXmlApplicationContext("Beans.xml");
		// BeanFactory context=new ClassPathXmlApplicationContext("Beans.xml","Beans2.xml");
		// ApplicationContext context2=new ClassPathXmlApplicationContext("Beans2.xml");
		 HelloWorld obj1=(HelloWorld) context.getBean("helloWorld");
		 HelloWorld obj2=(HelloWorld) context.getBean("helloWorld1");
		 obj1.getMessage();
		 obj2.getMessage1();
		 System.out.println( "singleton object : "+obj1+"\nprototype object :"+obj2 +"\n");

		 HelloWorld obj3=(HelloWorld) context.getBean("helloWorld");
		 HelloWorld obj4=(HelloWorld) context.getBean("helloWorld1");
		 obj3.getMessage();
		 obj4.getMessage1();
		 System.out.println( "singleton object : "+obj3+"\nprototype object :"+obj4 );

		// HelloWorld obj5=(HelloWorld) context.getBean("helloWorld3");
		// HelloWorld obj6=(HelloWorld) context.getBean("helloWorld4");
		// obj5.getMessage();
		// obj6.getMessage1();
		// System.out.println("\nsecond context");
		// System.out.println( "singleton object : "+obj5+"\nprototype object :
		// "+obj6 +"\n");
	//	((AbstractApplicationContext) context).close();
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
