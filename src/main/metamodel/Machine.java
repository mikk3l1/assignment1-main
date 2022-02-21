package main.metamodel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Machine {
	
	private List<State> states = new ArrayList<State>();
	private State initialState;
	private List<String> integers = new ArrayList<String>();
	
	public Machine(Collection<State> states, State initialState, Collection<String> integers) {
		super();
		this.integers.addAll(integers);
		this.states.addAll(states);
		this.initialState = initialState;
	}
	

	public List<State> getStates() {
		// TODO Auto-generated method stub
		return states;		
		//return null;
	}

	public State getInitialState() {
		// TODO Auto-generated method stub
		return initialState;
		//return null;
	}

	public State getState(String string) {
		// TODO Auto-generated method stub
		for	(State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return integers.size();
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		for	(String str: integers) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
}
