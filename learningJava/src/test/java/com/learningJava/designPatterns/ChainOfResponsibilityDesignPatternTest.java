package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ChainOfResponsibilityDesignPatternTest {
	
	@Test
	void test() {
		Handler manager = new Manager();
		Handler director = new Director();
		Handler ceo = new ChainOfResponsibilityDesignPattern();
		
		manager.setNext(director);
		director.setNext(ceo);
		
		assertTrue(manager.handleRequest("something"));
	}

}
