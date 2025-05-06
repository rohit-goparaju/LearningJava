package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CommandPatternTest {
	
	@Test
	void test() {
		CommandPattern test = new CommandPattern();
		assertTrue(test.turnOn.execute());
	}

}
