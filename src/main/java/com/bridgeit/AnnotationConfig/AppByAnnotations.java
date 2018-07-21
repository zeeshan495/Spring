package com.bridgeit.AnnotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppByAnnotations {
	public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigFile2.class);
	ConfigMessage object1 = (ConfigMessage) context.getBean(ConfigMessage.class);	
	object1.setMessage("");
	object1.test();
	System.out.println("first  object "+object1);
	
	ConfigMessage object2 = (ConfigMessage) context.getBean(ConfigMessage.class);
	System.out.println("second object "+object2+"\n");
	
	ConfigMessage2 object3=(ConfigMessage2)context.getBean(ConfigMessage2.class);
	object3.setMessage("");
	System.out.println("third object "+object3);
	
	ConfigMessage2 object4=(ConfigMessage2)context.getBean(ConfigMessage2.class);
	System.out.println("forth object "+object4);
	((AbstractApplicationContext) context).registerShutdownHook();
	}
}
