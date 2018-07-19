package com.bridgeit.Annotations;

public class ConfigMessage2 {
	private String message;
	public void setMessage(String message)
	{
		this.message=message;
	}
	public void getMessage()
	{
		System.out.println("inside config Message 2 "+message);
	}

}
