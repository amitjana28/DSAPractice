package CodingQuestions;

public class arrSubString {

	static void arrSub(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print("[");
				for(int k=i; k<=j; k++) {
					System.out.print(arr[k]+",");
				}
				System.out.print("]");
			}
			System.out.println();
		}
	}
	
	static void stringSub(String s, int n) {
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.println(s.substring(i,j+1));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,5,6,3,8,9};
		String str = "Geeks";
		stringSub(str,str.length());
		arrSub(arr, arr.length);

	}

}
