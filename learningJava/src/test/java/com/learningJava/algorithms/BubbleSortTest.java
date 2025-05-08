package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.r96.util.SortUtil;

public class BubbleSortTest {
	@Test
	void test() {
		int[] arr = {3,2,5,1,4};
		
		assertFalse(SortUtil.isSorted(arr));
		BubbleSort.sort(arr);
		assertTrue(SortUtil.isSorted(arr));
	}
}
