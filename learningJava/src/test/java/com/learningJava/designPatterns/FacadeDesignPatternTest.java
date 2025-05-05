package com.learningJava.designPatterns;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FacadeDesignPatternTest {

	@Test
	void test() {
		FacadeDesignPattern computer = new FacadeDesignPattern();
		assertTrue(computer.startComputer().equals("CPU started Memory loaded Reading from HDD"));
	}
}
