package com.r96.util;

import java.util.StringJoiner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SortUtil {

	public static final Logger log = LoggerFactory.getLogger(SortUtil.class);
	
	public static boolean isSorted(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] < arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void printArr(int[] arr) {
		StringJoiner joiner = new StringJoiner(",");
		for(int i : arr) {
			joiner.add(""+i);
		}
		log.info(joiner.toString());
	}
	
}
