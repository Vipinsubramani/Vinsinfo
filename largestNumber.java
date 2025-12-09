package vinsinfo;
import java.util.Scanner;
public class largestNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of an array:");
		int n;
		n=sc.nextInt();
			int[] arr2=new int[n];
			
			System.out.print("enter the element");
			for(int i=0;i<n;i++) {
				arr2[i]=sc.nextInt();
				
			}
		System.out.print(findTheHightest(arr2));
		sc.close();
	}
	static int findTheHightest (int[]arr) {
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
			
		}
		return max;
		
	}

}
