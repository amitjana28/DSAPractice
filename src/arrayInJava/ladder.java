package ArrayInJava;

public class ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,4,5,8,9};
		int val = 458;
		int result = 1;
		
		while(val!=0) {
			result = result*(val%10);
			val = val/10;
		}
		
		int count = 1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				count++;
			}
		}
		
		System.out.println(count);
		System.out.println(result);
	}

}
