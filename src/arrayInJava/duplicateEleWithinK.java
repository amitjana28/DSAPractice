package ArrayInJava;

public class duplicateEleWithinK {
	
	static boolean dupWithinK(int[] arr, int k) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length && j<=i+k; j++) {
				if(arr[j]==arr[i])
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 4};
		int k = 3;
		
		System.out.println(dupWithinK(arr, k));

	}

}
