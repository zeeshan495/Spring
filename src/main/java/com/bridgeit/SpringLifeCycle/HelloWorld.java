package com.bridgeit.SpringLifeCycle;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld
		implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware, BeanFactoryAware {
	private String message1, message2;

	public HelloWorld() {
		super();
		System.out.println("Helloworld beanObject created");
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage1() {
		System.out.println("\n getMessage() : " + message1);
		return message1;
	}

	public void getMessage2() {
		System.out.println(" getMessage2() : " + message2);
	}

	public void init() {
		System.out.println("bean intialization");
	}

	public void destroy() {
		System.out.println("bean destryed");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("\nafterPropertiesSet() method of bean is called after all bean properties have been set");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("\nsetBeanFactory()...Which type of instance will be returned depends on the bean factory configuration");
		System.out.println("setBeanFactory:: Aware bean singleton=" + beanFactory.isSingleton("helloWorld1"));
		System.out.println("setBeanFactory:: Aware bean singleton=" + beanFactory.isPrototype("helloWorld1"));
	}

	public void setBeanName(String name) {
		System.out.println("\nsetBeanName()...it will set the name of the bean in the bean factory that created this bean. \nbean name is : " + name);
		// System.out.println("bean name is defined as : "+name);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("\nsetApplicationContext()...this call will be used to initialize the object.");
	}

	public void customDestroy() throws Exception {
		System.out.println("custom destroy method of  bean is called !! ");
	}

	public void customInit() throws Exception {
		System.out.println("custom Init  method of  bean is called !! ");
	}
	@Override
	public String toString() {
		return "HelloWorld [message1=" + message1 + ", message2=" + message2 + "]";
	}

}
