package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AbstractFactoryDesignPatternTest {
	AbstractFactoryDesignPattern diningRoomFactory = new AbstractFactoryDesignPattern();
	
	@Test
	void utensilTest() {
		UtensilFactory utensilFactory = (UtensilFactory) diningRoomFactory.getFactory("UtensilFactory");
		Utensil bowl = utensilFactory.create("Bowl", "hold icecream");
		Utensil spoon = utensilFactory.create("Spoon", "eat icecream");
		
		assertTrue(spoon.getPurpose().equals("eat icecream"));
		assertTrue(bowl.getPurpose().equals("hold icecream"));
	}
	
	@Test
	void furnitureTest() {
		FurnitureFactory furnitureFactory = (FurnitureFactory) diningRoomFactory.getFactory("FurnitureFactory");
		Furniture diningTable = furnitureFactory.create("DiningTable", "eat on");
		Furniture diningChair = furnitureFactory.create("DiningChair", "sit on");
		
		assertTrue(diningChair.getPurpose().equals("sit on"));
		assertTrue(diningTable.getPurpose().equals("eat on"));
	}
}
