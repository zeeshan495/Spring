package com.bridgeit.DependencyInjection;

import org.springframework.stereotype.Component;


public class SpellChecker {

	public SpellChecker() {
		super();
		System.out.println("SpellChecker object created");
		
	}
	
	public void spellChecking()
	{
		System.out.println("spell checking......Dependency Injection is working");
	}

}
