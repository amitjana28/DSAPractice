package ArrayInJava;

import java.util.Scanner;

public class BasicArrayOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Declare size of an array
		System.out.print("Enter size of an array : ");
		int n = sc.nextInt();
		
		// Declare array
		int[] arr = new int[n];
		
		// Enter value of an array
		for(int i =0; i<n; i++) {
			arr[i]= sc.nextInt();		
		}
		
		printArray(arr, n);
		
		int[] newArray = insertArray(arr, n, 42, 3);
		printArray(newArray, newArray.length);
		
		newArray = deleteArray(arr, n, 4);
		printArray(newArray, newArray.length);
	}

	// Function to Deletion of array element
	private static int[] deleteArray(int[] arr, int n, int ele) {
		int[] newArray = new int[n-1];
		int pos = -1;
		
		// Linear search of an element from an array
		for(int i=0; i<n; i++) {
			if(arr[i]==ele) {
				pos=i;
			}
		}
		
		if(pos == -1) {
			System.out.printf("Element %d is not present.\n", ele);
			return arr;
		}else {
			int i=0;
			while(i<n) {
				if(i<pos) {
					newArray[i] = arr[i];
					i++;
				}else if(i == pos) {
					i++;
					continue;
				}else {
					newArray[i-1]=arr[i];
					i++;
				}
			}
		}
		
		return newArray;
	}

	// Function to insert a number into an array
	private static int[] insertArray(int[] arr, int n, int ele, int pos) {
		int[] newArr = new int[n+1];
		int i=0;
		while(i<=n) {
			if(i<pos-1) {
				newArr[i]=arr[i];
				i++;
			}else if(i==pos-1) {
				newArr[i]=ele;
				i++;
			}else {
				newArr[i]=arr[i-1];
				i++;
			}
		}
		return newArr;
	}

	// function to print an array
	public static void printArray(int[] arr, int n) {
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

}
