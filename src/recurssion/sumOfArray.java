package recurssion;

public class sumOfArray {

	static int sumOfArr(int[] arr, int n) {
		if(n<=0)
			return 0;
		return arr[n-1]+sumOfArr(arr,n-1);
	}
	public static void main(String[] args) {
		int[] arr = {4,8,85};
		System.out.println(sumOfArr(arr,arr.length));

	}

}
