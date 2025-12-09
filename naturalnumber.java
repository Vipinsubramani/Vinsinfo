package vinsinfo;

public class naturalnumber {
	public static void main(String[]args) {
		int a =5;
		System.out.println(findSum(a));
	}
	static int findSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		
		// another method:n*(n+1)/2 formula
		return sum;
	}

}
