package main;

import main.metamodel.Transition;
import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {

	private Machine machine;
	private State currentState;
	
	public void run(Machine m) {
		// TODO Auto-generated method stub
		this.machine = m;
		currentState = m.getInitialState();
	}

	public State getCurrentState() {
		// TODO Auto-generated method stub
		return currentState;
		//return null;
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		for (Transition t: currentState.getTransitions()) {
			if (t.getEvent().equals(string)) {
				//t.effect();
				currentState = t.getTarget();
				return;
			}
		}
		System.err.println("Unhandled event " + string);
		
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
