package com.learningJava.algorithms;

public class LinearSearch {
	public static int search(int element, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element)
				return i;
		}
		return -1;
	}
}
