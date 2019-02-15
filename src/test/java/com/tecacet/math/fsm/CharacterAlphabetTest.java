package com.tecacet.math.fsm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CharacterAlphabetTest {

	@Test
	public void testAlphabet() {
		LowercaseAlphabet alphabet = new LowercaseAlphabet(new char[] { 'a', 'b' });
		assertEquals(2, alphabet.getSymbolSet().size());
		assertFalse(alphabet.contains('g'));
		assertTrue(alphabet.contains('b'));
	}

	@Test
	public void testAllLowerCaseLetters() {
		LowercaseAlphabet alphabet = new LowercaseAlphabet();
		assertEquals("[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]", Arrays.toString(alphabet.getSymbols()));
	}
	
	@Test
	public void testAllUpperCaseLetters() {
		UppercaseAlphabet alphabet = new UppercaseAlphabet();
		assertEquals("[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]", Arrays.toString(alphabet.getSymbols()));
	}
}
