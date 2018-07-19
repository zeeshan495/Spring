package com.bridgeit.SpringDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof HelloWorld)
		{
			HelloWorld helloworld=(HelloWorld)bean;
			System.out.println("postProcess BeforeInitialization beanName : "+beanName);
			System.out.println(" postProcessBeforeInitialization() value of message is  : "+helloworld.getMessage());
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof HelloWorld)
		{
			HelloWorld helloworld=(HelloWorld)bean;
			System.out.println("\npostProcess AfterInitialization beanName : "+beanName);
			System.out.println(" postProcessAfterInitialization() value of message is : "+helloworld.getMessage());
			helloworld.setMessage("updated");
		}
		return bean;
	}
	

}
