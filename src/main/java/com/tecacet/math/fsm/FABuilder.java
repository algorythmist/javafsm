package com.tecacet.math.fsm;

/**
 * Base Builder for a Finite Automaton
 * @param <S>
 * @param <C>
 */
public interface FABuilder<S,C> {

	/**
	 * Set the initial state
	 * @param initialState the initial state
	 * @return the builder
	 * @throws FABuilderException
	 */
	FABuilder<S, C> setInitialState(S initialState) throws FABuilderException;

	/**
	 * Mark a state as final
	 * @param state can be an existing or new state
	 * @return the builder
	 * @throws FABuilderException
	 */
	FABuilder<S, C> addFinalState(S state) throws FABuilderException;

	/**
	 * Create a state transition on a symbol
	 * @param from
	 * @param to
	 * @param c
	 * @return the builder
	 * @throws FABuilderException
	 */
	FABuilder<S, C> addTransition(S from, S to, C c) throws FABuilderException;

}
