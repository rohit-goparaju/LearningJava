package com.learningJava.algorithms;

public class QuickSort {
	public static void sort(int[] arr, int indexFrom, int indexTo) {
		if(indexFrom >= indexTo) {
			return;
		}
		int pivotFinalLocation = partition(arr, indexFrom, indexTo);

		if(pivotFinalLocation > indexFrom) {
			sort(arr, indexFrom, pivotFinalLocation-1);
		}
		if(pivotFinalLocation < indexTo) {
			sort(arr, pivotFinalLocation+1, indexTo);
		}
	}

	private static int partition(int[] arr, int indexFrom, int indexTo) {
		int pivot = arr[indexTo];
		int pivotFinalLocation = indexFrom;

		for(int index = indexFrom; index < indexTo; index++) {
			if(arr[index] < pivot) {
				if(pivotFinalLocation != index) {
					int temp = arr[index];
					arr[index] = arr[pivotFinalLocation];
					arr[pivotFinalLocation] = temp;
				}
				pivotFinalLocation++;
			}
		}
		int temp = arr[pivotFinalLocation];
		arr[pivotFinalLocation] = pivot;
		arr[indexTo] = temp;

		return pivotFinalLocation;
	}

}
