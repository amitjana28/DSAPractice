package MathematicsAlgo;

public class Gcd {
	
	public static int GCD(int n, int m) {
		if(n==0)
			return m;
		if(m==0)
			return n;
		if(n==m)
			return n;
		
		if(n>m) {
			if(n%m==0)
				return m;
			return GCD(n-m,m);
		}
		if(m%n==0)
			return n;
		return GCD(n,m-n);
	}

	public static void main(String[] args) {
		System.out.println(GCD(182, 8));

	}

}
