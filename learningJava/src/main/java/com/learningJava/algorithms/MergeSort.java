package com.learningJava.algorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	public static void sort(int[] arr, int fromIndex, int toIndex) {
		if(fromIndex >= toIndex) {
			return;
		}
		
		int midPoint = (fromIndex + toIndex)/2;

		sort(arr, fromIndex, midPoint);
		sort(arr, midPoint+1, toIndex);
		
		merge(arr, fromIndex, toIndex, midPoint);
		
	}

	private static void merge(int[] arr, int fromIndex, int toIndex, int midPoint) {
		int[] left = Arrays.copyOfRange(arr, fromIndex, midPoint+1);
		int[] right = Arrays.copyOfRange(arr, midPoint+1, toIndex+1);
		
		int l = 0;
		int r = 0;
		
		for(int i = fromIndex; i <= toIndex; i++) {
			
			if(l < left.length && r < right.length) {
				if(left[l] < right[r]) {
					arr[i] = left[l];
					l++;
				}
				else {
					arr[i] = right[r];
					r++;
				}
			}else {
				if(l >= left.length) {
					while(r < right.length) {
						arr[i++] = right[r++];
					}
				}
				if(r >= right.length) {
					while(l < left.length) {
						arr[i++] = left[l++];
					}
				}
			}
		}
	}

}
