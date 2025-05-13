package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	@Test
	void test() {
		int[] arr = {1,2,3,4};
		assertEquals(-1, BinarySearch.search(0, arr));
		assertEquals(1, BinarySearch.search(2, arr));
	}

}
