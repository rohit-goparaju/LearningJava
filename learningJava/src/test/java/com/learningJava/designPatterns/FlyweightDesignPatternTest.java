package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FlyweightDesignPatternTest {

	@Test
	void test() {
		FlyweightDesignPattern forest = new FlyweightDesignPattern();
		forest.plantTree(0, 0, "mango", "brown", "rough");
		forest.plantTree(1, 0, "neem", "brown", "smooth");
		assertTrue(forest.draw().equals("drawing mango tree at ( 0 , 0 ),drawing neem tree at ( 1 , 0 )"));
	}
	
}
