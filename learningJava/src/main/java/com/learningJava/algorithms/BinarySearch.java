package com.learningJava.algorithms;

public class BinarySearch {

	public static int search(int element, int[] arr) {
		return search(element, arr, 0, arr.length-1);
	}

	private static int search(int element, int[] arr, int fromIndex, int toIndex) {
		
		if(fromIndex > toIndex)
			return -1;
		
		int mid = (fromIndex+toIndex)/2;

		if(arr[mid] == element)
			return mid;
		else if(arr[mid] < element) 
			return search(element, arr, mid+1, toIndex);
		else
			return search(element, arr, fromIndex, mid-1);
	}
	
}
