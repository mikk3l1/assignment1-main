package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine {
	
	private State current;
	private State initial;
	private String currentEvent;
	private Map<String, State> states = new HashMap<>();
	private List<String> integers = new ArrayList<String>();
	
	public StateMachine() { }
	
	private State getState(String name) {
		if(!states.containsKey(name)) {
			states.put(name, new State(name));
		}
		return states.get(name);
	}
	
	
	public Machine build() {
		// TODO Auto-generated method stub
		return new Machine(states.values(), initial, integers);
		//return null;
	}

	public StateMachine state(String string) {
		// TODO Auto-generated method stub
		current = getState(string);
		return this;
		//return null;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		initial = current;
		return this;
		//return null;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		currentEvent = string;
		return this;
		//return null;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		Transition t = new Transition(currentEvent, getState(string));
		current.addTransition(t);
		return this;
		//return null;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub;
		states.put(string, new State(Integer.toString(i)));
//		Transition t = new Transition(currentEvent, getState(string));
//		current.addTransition(t);
		return this;
		
		
//		states.put(string, new State(Integer.toString(i)));
//		return this;
//		return null;
	}
	
	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		integers.add(string);
		return this;
		//return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub	
		int i = Integer.parseInt(states.get(string).getName().toString());
		System.out.println(i);
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
