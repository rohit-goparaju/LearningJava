package com.learningJava.designPatterns;

public class StatePattern {

	State start = new StartState();
	State stop = new StopState();
	Context context = new Context();
}

//State interface
interface State{
	String handle();
}

//concrete states
class StartState implements State{
	@Override
	public String handle() {
		return "Start state";
	}
}

class StopState implements State{
	@Override
	public String handle() {
		return "Stop state";
	}
}

//Context class

class Context{
	State state;

	public void setState(State state) {
		this.state = state;
	}
	
	public String request() {
		return state.handle();
	}
}