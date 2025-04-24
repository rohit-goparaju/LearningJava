package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactoryDesignPatternTest {
	FactoryDesignPattern shapeFactory = new FactoryDesignPattern();
	
	@Test
	public void circleTest() {
		
		Shape myCircle= shapeFactory.getShape("Circle",10);
		assertTrue(myCircle.getDisplayString().equals("Circle with radius 10"));
	}
	
	@Test
	public void triangleTest() {
		Shape myTriangle = shapeFactory.getShape("Triangle",10);
		assertTrue(myTriangle.getDisplayString().equals("Triangle with side 10"));
	}
	
	@Test
	public void nullTest() {
		Shape myShape = shapeFactory.getShape("Pencil", 100);
		assertNull(myShape);
	}
	
}
