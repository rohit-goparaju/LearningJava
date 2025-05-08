package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.r96.util.SortUtil;

public class QuickSortTest {

	@Test
	void test() {
		int[] arr = {1,6,3,5,2};
		assertFalse(SortUtil.isSorted(arr));
		QuickSort.sort(arr, 0, arr.length-1);
		assertTrue(SortUtil.isSorted(arr));
	}
}
