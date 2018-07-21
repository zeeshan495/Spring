package com.bridgeit.AnnotationConfig;

public class ConfigMessage2 {
	private String message;
	
	public ConfigMessage2() {
		System.out.println("ConfigMessage2 prototype beanObject created");
	}
	
	public void setMessage(String message)
	{
		this.message=message;
	}
	public void getMessage()
	{
		System.out.println(message);
	}

}
