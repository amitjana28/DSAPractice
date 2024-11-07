package arrayInJava;

import java.io.*;

public class getMinMax {
	
	static class pair{
		int max;
		int min;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		pair res = new pair();
		res = getMinMax(arr, 0, n-1);
		System.out.println(res.min + " "+ res.max);
	}

	private static pair getMinMax(int[] arr, int low, int high) {
		pair minmax = new pair();
		pair mml = new pair();
		pair mmr = new pair();
		int mid;
		
		if(low == high) {
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}
		
		if(high == low+1) {
			if(arr[high]>arr[low]) {
				minmax.max = arr[high];
				minmax.min = arr[low];
				return minmax;
			}else {
				minmax.max = arr[low];
				minmax.min = arr[high];
				return minmax;
			}
		}
		
		mid = (high+low)/2;
		mml = getMinMax(arr, low, mid);
		mmr = getMinMax(arr, mid+1, high);
		
		if(mml.min < mmr.min) {
			minmax.min = mml.min;
		}else {
			minmax.min = mmr.min;
		}
		
		if(mml.max > mmr.max) {
			minmax.max = mml.max;
		}else {
			minmax.max = mmr.max;
		}
		
		return minmax;
	}

}
