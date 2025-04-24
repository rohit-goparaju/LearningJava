package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SingletonDesignPatternTest {

	@Test
	public void test() {
		SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
		SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
		
		assertTrue(instance1 == instance2);
	}
}
