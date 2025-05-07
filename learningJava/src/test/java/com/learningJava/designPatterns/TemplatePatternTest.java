package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TemplatePatternTest {

	@Test
	void test() {
		TemplatePattern p = new TemplatePattern();
		assertTrue(p.r6.play().equals("R6Siege initialized,R6Siege started,R6Siege stopped"));
	}
}
