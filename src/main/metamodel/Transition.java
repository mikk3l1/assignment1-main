package main.metamodel;


public class Transition {
	
	private String event;
	private State to;
	
	public Transition(String event, State to) {
		super();
		this.event = event;
		this.to = to;
	}

	public Object getEvent() {
		// TODO Auto-generated method stub
		return event;
		//return null;
	}

	public State getTarget() {
		// TODO Auto-generated method stub
		return to;
		//return null;
	}

	public boolean hasSetOperation() {
		// TODO Auto-generated method stub
		if (this.event.equals("SET")) {
			return true;
		}
		return false;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		if (this.event.equals("increment")) {
			return true;
		}
		return false;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		if (this.event.equals("decrement")) {
			return true;
		}
		return false;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		System.out.println(this.getEvent()); // returns "SET"
		System.out.println(this.getTarget()); // returns memory address
		System.out.println(this.getTarget().getName()); // returns "state 2"
		System.out.println(this.getTarget().getTransitions()); // returns [ ]
		
		return null;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
