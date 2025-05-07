package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StatePatternTest {
	@Test
	void test() {
		StatePattern p = new StatePattern();
		p.context.setState(p.start);
		assertTrue(p.context.request().equals(p.start.handle()));
		p.context.setState(p.stop);
		assertTrue(p.context.request().equals(p.stop.handle()));
	}

}
