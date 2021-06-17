package com.tecacet.math.fsm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Basic alphabet-independent implementation of Word. This implementation does
 * not validate if symbols added belong to a particular alphabet.
 *
 * @param <C>
 */
public class BasicWord<C> implements Word<C> {

    private List<C> symbols = new ArrayList<>();

    public BasicWord(Collection<C> string) {
        symbols.addAll(string);
    }

    @Override
    public C symbolAt(int index) {
        return symbols.get(index);
    }

    @Override
    public int length() {
        return symbols.size();
    }

    @Override
    public List<C> asList() {
        return symbols;
    }

    public static Word<Character> fromString(String s) {
        var ac =
                IntStream.range(0, s.length()).mapToObj(s::charAt).collect(Collectors.toList());
        return new BasicWord<>(ac);
    }

    @Override
    public String toString() {
        return symbols.toString();
    }
}
