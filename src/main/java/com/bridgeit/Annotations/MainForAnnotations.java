package com.bridgeit.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainForAnnotations {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Student.xml");
		StudentDetails details=(StudentDetails)context.getBean("StudentDetails");
		System.out.println(details);
		((AbstractApplicationContext) context).close();
	}

}
