package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CompositeDesignPatternTest {
	
	@Test
	void test() {
		CircleGraphic leaf1 = new CircleGraphic();
		SquareGraphic leaf2 = new SquareGraphic();
		
		CompositeDesignPattern composite = new CompositeDesignPattern();
		composite.add(leaf1);
		composite.add(leaf2);
	
		assertTrue(leaf1.draw().equals("Drawing circle"));
		assertTrue(leaf2.draw().equals("Drawing square"));
		assertTrue(composite.draw().equals("Drawing circle Drawing square "));
		composite.remove(leaf2);
		assertTrue(composite.draw().equals("Drawing circle "));
		
	}
	
}
