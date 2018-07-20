package com.bridgeit.DependencyInjection;

public class SpellChecker {

	public SpellChecker(int id,String name) {
		super();
		System.out.println("inside SpellChecker constructor");
		System.out.println("myId = "+id+" myName = "+name);
		
	}
	
	public void spellChecking()
	{
		System.out.println("spell checking.........");
	}

}
