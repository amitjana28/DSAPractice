package ArrayInJava;

import java.io.*;

public class ReverseArray {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the array : ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());		
		}
		
		int[] reverseArr = reverseArray(arr, n);
		BasicArrayOperations.printArray(reverseArr, reverseArr.length);
	}

	private static int[] reverseArray(int[] arr, int n) {
		int low=0;
		int high=n-1;
		while(low<high) {
			int temp = arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		return arr;
	}

}
