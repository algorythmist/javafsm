package com.tecacet.math.fsm;

public class CharacterAlphabet extends Alphabet<Character> {

    public void addSymbol(char c) {
        symbols.add(c);
    }

    public boolean contains(char c) {
        return this.contains(Character.valueOf(c));
    }

    public char[] getSymbols() {
        char[] array = new char[symbols.size()];
        int i = 0;
        for (Character c : symbols) {
            array[i++] = c;
        }
        return array;
    }

    @Override
    public String toString() {
        return getSymbols().toString();
    }
}
