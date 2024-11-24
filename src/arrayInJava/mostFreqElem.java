package ArrayInJava;

public class mostFreqElem {

	public static void main(String[] args) {
		int[] arr = {2,5,1,2,3,5,6,1,5,3,1};
		int maxCount = 0;
		int maxFreqNum = 0;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount = count;
				maxFreqNum = arr[i];
			}
		}

		System.out.println(maxFreqNum + " : "+ maxCount);
	}

}
