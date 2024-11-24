package recurssion;

public class DecimalToBinary {

	static int binaryConverter(int n) {
		if(n==0)
			return 0;
		return (n%2)+10*binaryConverter(n/2);
		
	}
	public static void main(String[] args) {
		System.out.println(binaryConverter(22));

	}

}
