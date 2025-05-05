package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ProxyDesignPatternTest {
	
	@Test
	void test() {
		ProxyDesignPattern internetAccessFilter = new ProxyDesignPattern();
		Employee e = new Employee("Rohit", 6);
		Employee e2 = new Employee("Ammi", 5);
		internetAccessFilter.grantInternetAccess(e);
		internetAccessFilter.grantInternetAccess(e2);
		assertTrue(e.internetAccess);
		assertFalse(e2.internetAccess);
		
	}

}
