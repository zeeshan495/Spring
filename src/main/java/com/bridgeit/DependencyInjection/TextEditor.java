package com.bridgeit.DependencyInjection;

public class TextEditor {
	private SpellChecker spellCheckerDependencyRef;

	public void setSpellCheckerDependencyRef(SpellChecker spellChecker) {
		System.out.println("setting spell check");
		this.spellCheckerDependencyRef = spellChecker;
	}

//	public TextEditor(SpellChecker spellChecker) {
//		System.out.println("inside textEditor constructor....getting obj ref by constructor DI");
//		this.spellCheckerDependencyRef = spellChecker;
//	}

	public void spellCheck() {
		spellCheckerDependencyRef.spellChecking();
	}

}
