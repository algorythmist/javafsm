package com.tecacet.math.fsm;

import java.util.HashMap;
import java.util.Map;

public class StateTransitionTable<S, C> implements StateTransitionDiagram<S, C> {

	private final Map<Pair<S, C>, S> transitionMap = new HashMap<>();

	public void addTransition(S fromState, C symbol, S toState) {
		transitionMap.put(new Pair<>(fromState, symbol), toState);
	}

	public S getNextState(S from, C symbol) throws InvalidTransitionException {
		if (!transitionMap.containsKey(new Pair<>(from, symbol))) {
			throw new InvalidTransitionException(String.format(
					"There is no transition from state %s on symbol %s.", from,
					symbol));
		}
		return transitionMap.get(new Pair<>(from, symbol));
	}

	public String getDetails() {
		StringBuilder sb = new StringBuilder();
		for (var pair : transitionMap.keySet()) {
			sb.append("State: " + pair.state() + ", symbol = " + pair.symbol()
					+ "\n");
			S state = transitionMap.get(new Pair<>(pair.state(), pair.symbol()));
			sb.append(" gives " + state + "\n");
			sb.append("map contains this key = "
					+ transitionMap.containsKey(new Pair<>(pair.state(),
							pair.symbol())));
			sb.append("map contains this value = "
					+ transitionMap.containsValue(pair.state()));
		}
		return sb.toString();
	}

}
