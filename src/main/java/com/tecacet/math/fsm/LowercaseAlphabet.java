package com.tecacet.math.fsm;

import java.util.Arrays;

/**
 * An <i>Alphabet</i> is a finite set of Symbols. In this implementation a
 * symbol is represented by a character and a string (or word) by a
 * java.lang.String
 */
public class LowercaseAlphabet extends CharacterAlphabet {

	/**
	 * Create an alphabet with all lowercase characters
	 */
	public LowercaseAlphabet() {
		super();
		for (char c = 'a'; c <= 'z'; c++) {
			symbols.add(c);
		}
	}

	public LowercaseAlphabet(char[] symbols) {
		super();
		for (char c : symbols) {
			this.symbols.add(c);
		}
	}

}
