package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BridgeDesignPatternTest {
	
	@Test
	void test() {
		BridgeDesignPattern squareShape = new BridgeDesignPattern(new RedColor());
		assertTrue(squareShape.draw().equals("Drawing square Applying red color"));
	}

}
