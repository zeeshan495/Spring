package com.bridgeit.LazyInitialization;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLazyInit {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("ApplicationContext is loaded");
		LazyInit lazyObj=(LazyInit) context.getBean("lazyInit");
	//	NoLazyInit nolazyObj=(NoLazyInit) context.getBean("nolazyInit");
		context.close();
	}

}
