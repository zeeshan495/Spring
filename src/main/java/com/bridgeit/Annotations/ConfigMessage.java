package com.bridgeit.Annotations;

public class ConfigMessage {
	private String message;
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
		System.out.println("testing.......configurations by annotaions...inside ConfigMessage");
	}

}
