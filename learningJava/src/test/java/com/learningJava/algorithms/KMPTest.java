package com.learningJava.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KMPTest {

	@Test
	void test() {
		String text = "aabaacaabaaab";
		String pattern = "aaab";
		
		assertEquals(9,KMP.search(pattern, text));
		
		int[] lps = KMP.createLpsArray(pattern);
		assertEquals(0,lps[0]);
		assertEquals(1,lps[1]);
		assertEquals(2,lps[2]);
		assertEquals(0,lps[3]);
		
		lps = KMP.createLpsArrayInefficient(pattern);
		assertEquals(0,lps[0]);
		assertEquals(1,lps[1]);
		assertEquals(2,lps[2]);
		assertEquals(0,lps[3]);
		
	}
}
