package com.bridgeit.DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Dependency.xml");
		TextEditor te=(TextEditor)context.getBean("textEditor");
		te.spellCheck();
		//((AbstractApplicationContext) context).close();
		context.close();
	}

}
