package sortingAlgorithems;

import arrayInJava.BasicArrayOperations;

public class bubbleSort {

	public static void main(String[] args) {
		int[] arr = {10,5,8,20,2,18};
		
		int[] sortedArray = selectionSorting(arr,arr.length);
		
		BasicArrayOperations.printArray(sortedArray, sortedArray.length);

	}

	private static int[] selectionSorting(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			int minIndex = i;
			for(int j=i+1;j<n ;j++) {
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			System.out.println(minIndex);
			int temp = arr[i];
			arr[i]= arr[minIndex];
			arr[minIndex]= temp;
		}
		return arr;
	}

	private static int[] bubbleSorting(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			Boolean swapped = false;
			for(int j=0; j<n-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
		}

		return arr;
	}

}
