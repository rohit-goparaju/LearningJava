package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MediatorPatternTest {
	
	@Test
	void test() {
		MediatorPattern mediatorTest = new MediatorPattern();
		
		assertTrue(mediatorTest.user1.send("Hello"));
	}
}
