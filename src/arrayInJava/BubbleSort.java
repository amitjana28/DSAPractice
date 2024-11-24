package ArrayInJava;

public class BubbleSort {
	static int[] selectionSort(int[] arr, int n) {
		for(int i=0; i<n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		return arr;
	}
	static int[] insertionSort(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	static int[] bubbleSort(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			boolean swapped = false;
			for(int j =0; j<n-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(swapped == false)
				break;
			
			System.out.println(i);
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {42,65,32,12,52,95,12};
		
		insertionSort(arr, arr.length);
		
		for(int val : arr) {
			System.out.println(val);
		}

	}

}
