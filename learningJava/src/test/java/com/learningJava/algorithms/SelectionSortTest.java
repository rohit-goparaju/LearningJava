package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

import com.r96.util.R96Random;
import com.r96.util.SortUtil;

public class SelectionSortTest {
	
	@Test
	void test() {
		int[] arr = R96Random.getRandomIntArr(new Random().nextInt(10, 50));
		SelectionSort.sort(arr);
		assertTrue(SortUtil.isSorted(arr));
	}
	
}
