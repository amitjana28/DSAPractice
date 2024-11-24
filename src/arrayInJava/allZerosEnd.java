package ArrayInJava;

public class allZerosEnd {
	
	static void allZeros(int[] arr, int n) {
		int start = 0, end = n-1;
		
		while(start<end) {
			if(arr[start]==0 && arr[end]==0) {
				end--;
			}else if(arr[start]!=0 && arr[end]==0) {
				start++;
				end--;
			}else if(arr[start]!=0 && arr[end]!=0) {
				start++;
			} else {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end]=temp;	
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,5,0,6,3,0,0,2,0};
		
		allZeros(arr, arr.length);
		
	}

}
