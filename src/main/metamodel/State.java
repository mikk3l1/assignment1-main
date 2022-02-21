package main.metamodel;

import java.util.ArrayList;
import java.util.List;


public class State {
	
	private String name;
	private List<Transition> transitions = new ArrayList<>();
	
	public State(String name) {
		super();
		this.name = name;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
		//return null;
	}
	
	public void addTransition(Transition t) {
		this.transitions.add(t);
	}
	

	public List<Transition> getTransitions() {
		// TODO Auto-generated method stub
		return transitions;
		//return null;
	}

	public Transition getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		for (Transition transition : transitions) {
			if (transition.getEvent().equals(string)) {
				return transition;
			}
		}
		return null;
	}

}
