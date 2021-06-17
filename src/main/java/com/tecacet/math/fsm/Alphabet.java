package com.tecacet.math.fsm;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * An <i>Alphabet</i> is a finite set of Symbols.
 *
 * @param <C> parametrizes the set of symbols
 */
public class Alphabet<C> {

    protected Set<C> symbols = new LinkedHashSet<>();

    protected Alphabet() {

    }

    public Alphabet(C[] symbols) {
        this.symbols.addAll(Arrays.asList(symbols));
    }

    public Alphabet(Collection<C> symbols) {
        this.symbols.addAll(symbols);
    }

    /**
     * Indicates if the alphabet contains a particular symbol
     *
     * @param symbol the symbol
     * @return true or false
     */
    public boolean contains(C symbol) {
        return symbols.contains(symbol);
    }

    public Set<C> getSymbolSet() {
        return symbols;
    }
}
