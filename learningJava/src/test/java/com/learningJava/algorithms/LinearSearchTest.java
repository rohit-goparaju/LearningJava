package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinearSearchTest {

	@Test
	void test() {
		int[] arr = {1,2,3,4};
		assertEquals(-1, LinearSearch.search(0, arr));
		assertEquals(2, LinearSearch.search(3, arr));
	}
	
}
