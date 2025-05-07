package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MementoPatternTest {

	@Test
	void test() {
		MementoPattern p = new MementoPattern();
		String initialState = p.origin.getState();
		p.careTaker.addMemento(p.origin.saveStateToMemento());
		p.origin.setState("State 2");
		String updatedState = p.origin.getState();
		
		assertTrue(updatedState.equals(p.origin.getState()));
		p.origin.getStateFromMemento(p.careTaker.getMemento(0));
		assertTrue(initialState.equals(p.origin.getState()));
		
	}
	
}
