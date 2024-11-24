package CodingQuestions;

public class MaxSubArraySum {
	
	static int maxSum(int[] arr) {
		int n= arr.length;
		int max = Integer.MIN_VALUE;
		
		for(int i =0; i<n; i++) {
			int curSum = 0;
			for(int j=i; j<n; j++) {
				curSum+=arr[j];
				max = Math.max(max, curSum);
			}
		}
		return max;
	}

	static int kadansAlgo(int[] arr) {
		int n = arr.length;
		int maxEnd = arr[0];
		int res = arr[0];
		 for(int i=0; i<n; i++) {
			 maxEnd = Math.max(maxEnd+arr[i], arr[i]);
			 res = Math.max(res, maxEnd);
		 }
		 return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,-8,7,-1,2,3};
		
		System.out.println(kadansAlgo(arr));
	}

}
