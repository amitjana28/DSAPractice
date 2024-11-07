package arrayInJava;
import java.io.*;

public class RannaSolution {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int ans1 = 0;
		int ans2 = 0;
		
		for(int i=n-1; i>=0; i-=2) {
			ans1+= arr[i]*arr[i];
		}
		for(int i=n-2; i>=0; i-=2) {
			ans2+= arr[i]*arr[i];
		}
		
		System.out.print(ans1-ans2);
		
	}

}
