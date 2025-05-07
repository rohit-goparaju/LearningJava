package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ObserverPatternTest {
	@Test
	void test() {
		ObserverPattern p = new ObserverPattern();
		assertTrue(p.agency.setNews("Hello"));
	}
}
