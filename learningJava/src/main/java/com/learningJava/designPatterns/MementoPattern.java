package com.learningJava.designPatterns;

import java.util.ArrayList;
import java.util.List;

public class MementoPattern {
	Originator origin = new Originator("State 1");
	Caretaker careTaker = new Caretaker();
}

class Originator{
	String state;

	public Originator(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}

class Memento{
	String state;
	
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}


class Caretaker{
	
	List<Memento> mementos = new ArrayList<>();
	
	boolean addMemento(Memento memento) {
		return mementos.add(memento);
	}
	
	Memento getMemento(int index) {
		return mementos.get(index);
	}
}
