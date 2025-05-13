package com.learningJava.algorithms;

public class InsertionSort {

	public static void sort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int currentElement = arr[i];
			boolean placed = false;
			int j = i-1;
			while(!placed && j >= 0) {
				if(currentElement < arr[j]) {
					arr[j+1] = arr[j];
				}else {
					arr[j+1] = currentElement;
					placed = true;
				}
				j--;
			}
			if(!placed) {
				arr[0] = currentElement;
			}
		}
	}
}
