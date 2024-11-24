package recurssion;

public class meanofArray {

	static float mean(int[] arr, int n) {
		if(n==1)
			return (float)(arr[n-1]);
		return (float)(mean(arr,n-1)*(n-1)+arr[n-1])/n;
	}
	public static void main(String[] args) {
		int[] arr = {4,2,5,69,2,8};
		System.out.println(mean(arr, arr.length));

	}

}
