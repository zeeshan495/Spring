package com.bridgeit.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TextEditor {
	
	public TextEditor() {
		System.out.println("texteditor object created");
	}

	private SpellChecker spellCheckerDependencyRef;

//	public void setSpellCheckerDependencyRef(SpellChecker spellChecker) {
//		this.spellCheckerDependencyRef = spellChecker;
//	}

	public TextEditor(SpellChecker spellChecker) {
		this.spellCheckerDependencyRef = spellChecker;
	}

	public void spellCheck() {
		spellCheckerDependencyRef.spellChecking(); 
	}

}
