package com.r96.util;

public class SortUtil {

	public static boolean isSorted(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] < arr[i]) {
				return false;
			}
		}
		return true;
	}
	
}
