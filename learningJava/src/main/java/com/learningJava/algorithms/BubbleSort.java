package com.learningJava.algorithms;

public class BubbleSort {

	public static void sort(int[] arr) {
		boolean sorted = false;
		
		for(int i = 0; i < arr.length-1; i++) {
			sorted = true;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
	}
}
