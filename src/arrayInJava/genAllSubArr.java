package ArrayInJava;

public class genAllSubArr {
	
	public static void printSubArr(int[] arr, int start, int end) {
		if(end==arr.length) {
			return;
		} else if(start>end) {
			printSubArr(arr, 0, end+1);
		}else {
			System.out.print("[");
			for(int i=start;i<end;i++) {
				System.out.print(arr[i]+",");
			}
			System.out.print(arr[end]+"]");
			printSubArr(arr, start+1, end);
			
		}
	}
	
	public static int[] moveZeroEnd(int[] arr, int n) {
		int count = 0;
		
		for(int i=0;i<n; i++) {
			if(arr[i]!=0) {
				
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {12,23,10,45};
		
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i; j<arr.length; j++) {
//				for(int k=i; k<=j; k++) {
//					System.out.print(arr[k]+" ");
//				}
//			}
//		}

		printSubArr(arr, 0, 0);
//		int[] moveArr = moveZeroEnd(arr, arr.length);
//		System.out.println();
		
//		for(int i=0; i<moveArr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	}

}
