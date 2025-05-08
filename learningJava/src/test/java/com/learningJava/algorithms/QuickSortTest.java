package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.r96.util.R96Random;
import com.r96.util.SortUtil;

public class QuickSortTest {

	@Test
	void test() {
		int[] arr = R96Random.getRandomIntArr(10);
		assertFalse(SortUtil.isSorted(arr));
		QuickSort.sort(arr);
		assertTrue(SortUtil.isSorted(arr));
	}
}
