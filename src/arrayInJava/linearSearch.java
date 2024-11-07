package ArrayInJava;


public class linearSearch {
	
	public static int[] prefixSum(int[] arr, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
			arr[i]=sum;
		}
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		return arr;
	}
	
	public static int[] removeDuplicate(int[] arr, int n) {
		int[] arrUniq = new int[n];
		int index = 0;
		
		for(int i=1; i<n; i++) {
			if(arr[i]!=arr[i-1]) {
				arrUniq[index]=arr[i-1];
				index++;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arrUniq[i]+" ");
		}
		return arrUniq;
		
	}
	
	public static boolean arraySorted(int[] arr, int n) {
		boolean isSorted = true;
		
		if(n<2)
			return true;
		
		if(arr[1]>arr[0]) {
			for(int i=1; i<n; i++) {
				if(arr[i]<arr[i-1])
					isSorted = false;
			}
		}else {
			for(int i=1; i<n; i++) {
				if(arr[i]>arr[i-1])
					isSorted = false;
			}
		}
		
		return isSorted;
	}
	
	public static void ladder(int[] arr, int n) {
		if(n==0) {
			System.out.println("Array is blank");
			return;
		}
		
		for(int i=0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
				if(arr[j]>arr[i])
					break;
				if(j==n-1)
					System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[n-1]+" ");
	}
	
	public static int linear(int[] arr, int n, int ele) {
		int pos = -1;
		
		for(int i=0; i<n; i++) {
			if(arr[i]==ele) {
				pos = i;
			}
		}
		return pos;
	}
	
	public static int largestEle(int[] arr, int n) {
		if(n==0)
			return -1;
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

	public static int secondLargest(int[] arr, int n) {
		
		if(n<2)
			return -1;
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i]>max) {
				secMax = max;
				max = arr[i];
			}
			if(arr[i]<max && arr[i]>secMax) {
				secMax = arr[i];
			}
		}
		return secMax;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[]{10, 20, 10, 5, 15};
		
		System.out.println(linear(arr, arr.length, 45));
		System.out.println(largestEle(arr, arr.length));
		System.out.println(secondLargest(arr, arr.length));
		ladder(arr, arr.length);
		System.out.println(arraySorted(arr, arr.length));
		removeDuplicate(arr, arr.length);
		System.out.println();
		prefixSum(arr, arr.length);
		

	}

}
