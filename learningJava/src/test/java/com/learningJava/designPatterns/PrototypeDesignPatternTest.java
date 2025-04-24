package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrototypeDesignPatternTest {
	@Test
	public void test() {
		PrototypeDesignPattern instance1 = new PrototypeDesignPattern("Rohit", 1);
		PrototypeDesignPattern instance2 = instance1.getClone();
		
		assertTrue(instance1.name.equals(instance2.name));
		assertTrue(instance1.value == instance2.value);
	}
}
