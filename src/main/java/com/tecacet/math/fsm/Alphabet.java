package com.tecacet.math.fsm;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * An <i>Alphabet</i> is a finite set of Symbols.
 * 
 * @param  C
 *            parametrizes the set of symbols
 */
public class Alphabet<C> {

    protected final Set<C> symbols = new LinkedHashSet<>();

    protected Alphabet() { }

    public Alphabet(C[] symbols) {
        this(Arrays.stream(symbols).collect(Collectors.toSet()));
    }

    public Alphabet(Collection<C> symbols) {
        this.symbols.addAll(symbols);
    }

    /**
     * Indicates if the alphabet contains a particular symbol
     * 
     * @param c a symbol
     * @return true if it's in the alphabet
     */
    public boolean contains(C c) {
        return symbols.contains(c);
    }

    public Set<C> getSymbolSet() {
        return symbols;
    }

    public static <S> Alphabet<S> fromSymbols(S... symbols) {
        return new Alphabet<>(symbols);
    }
}
