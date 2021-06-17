package com.tecacet.math.fsm;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;

public class AlphabetTest {

	@Test
	public void testAlphabet() {
		var alphabet = new Alphabet<>(new Character[]{'a','b'});
		assertEquals(2, alphabet.getSymbolSet().size());
		assertFalse(alphabet.contains('g'));
		assertTrue(alphabet.contains('b'));
		
		var otherAlphabet = new Alphabet<>(new HashSet<>());
		assertTrue(otherAlphabet.getSymbolSet().isEmpty());
	}

}
