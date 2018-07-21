package com.bridgeit.AnnotationConfig;

public class ConfigMessage {
	private String message;
	
	public ConfigMessage() {
	System.out.println("ConfigMessage singleton beanObject created");
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	public void getMessage()
	{
		System.out.println(message);
	}
	
	public void test()
	{
		System.out.println("working.......configurations by annotaions...inside ConfigMessage");
	}

}
