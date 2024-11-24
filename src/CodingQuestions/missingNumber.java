package CodingQuestions;

public class missingNumber {
	
	static int missing(int[] arr) {
		int xor1 = 0;
		int xor2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			xor2^=arr[i];
			System.out.print(xor2);
		}
		System.out.println();
		for(int i=1; i<=arr.length+1; i++) {
			xor1^=i;
			System.out.print(xor1);
		}
		System.out.println();
		
		return xor1^xor2;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7};
		System.out.println(missing(arr));

	}

}
