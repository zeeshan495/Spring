package com.bridgeit.DependencyInjection;

public class TextEditor {
	private SpellChecker spellChecker;


	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("setting spell check");
		this.spellChecker = spellChecker;
	}

//	public TextEditor(SpellChecker spellChecker) {
//		System.out.println("inside textEditor constructor");
//		this.spellChecker = spellChecker;
//	}

	public void spellCheck() {
		spellChecker.spellChecking();
	}

}
