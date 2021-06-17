package com.tecacet.math.fsm;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UppercaseAlphabet extends CharacterAlphabet {

	/**
	 * Create an alphabet with all lowercase characters
	 */
	public UppercaseAlphabet() {
		super();
		symbols = IntStream.range('A', 'Z'+1)
				.mapToObj(i -> Character.valueOf((char)i)).collect(Collectors.toSet());
	}

}

