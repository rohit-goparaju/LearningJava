package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DecoratorDesignPatternTest {

	@Test
	void test() {
		SimpleCoffee simpleCoffee = new SimpleCoffee();
		DecoratorDesignPattern milkCoffee = new DecoratorDesignPattern(simpleCoffee);
		
		assertTrue(simpleCoffee.getDesctription().equals("Simple coffee"));
		assertTrue(milkCoffee.getDesctription().equals("Simple coffee milk"));
		assertEquals(10, simpleCoffee.getCost());
		assertEquals(15, milkCoffee.getCost());
	}
	
}
