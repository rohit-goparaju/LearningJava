package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InterpreterPatternTest {
	@Test
	void test() {
		assertEquals(3, new InterpreterPattern().testHelper(1, 2));
	}

}
