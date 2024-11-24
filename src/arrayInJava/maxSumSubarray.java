package ArrayInJava;

public class maxSumSubarray {
	
	static int MSS(int[] arr, int n, int k) {
		int maxSum = 0;
		for(int i=0; i<n-k+1; i++) {
			int currSum = 0;
			for(int j=0; j<k; j++) {
				currSum+=arr[j+i];
			}
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	
	static int SWMSS(int[] arr, int n, int k) {
		int maxSum = 0;
		for(int i=0; i<k; i++) {
			maxSum+=arr[i];
		}
		int curSum = 0;
		for(int i=k; i<n; i++) {
			maxSum = maxSum+arr[i]-arr[i-k];
			curSum = Math.max(maxSum, curSum);
		}
		return curSum;
	}

	public static void main(String[] args) {
		int[] arr = {1,5,8,2,9,5,6};
		int n = arr.length;
		int k=3;
		System.out.println(SWMSS(arr, n, k));

	}

}
