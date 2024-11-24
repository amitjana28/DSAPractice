package ArrayInJava;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {11,21,36,45,52,68,89,93, 125};
		
		System.out.println(IterativeBS(arr, arr.length, 52));
		System.out.println(RecursiveBS(arr, arr.length, 0, arr.length-1, 52));
	}

	private static int RecursiveBS(int[] arr, int length, int low, int high, int ele) {
		if(low>high)
			return -1;
		
		int mid = (low+high)/2;
		
		if(arr[mid]==ele)
			return mid;
		else if(arr[mid]>ele)
			return RecursiveBS(arr, arr.length, low, mid-1, ele);
		else
			return RecursiveBS(arr, arr.length, mid+1, high, ele);
	}

	private static int IterativeBS(int[] arr, int n, int ele) {
		int low = 0, high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]>ele) {
				high = mid-1;
			}else if(arr[mid]==ele) {
				return mid;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}

}
