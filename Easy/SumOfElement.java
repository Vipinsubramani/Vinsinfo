package sample;

import java.util.Scanner;
public class SumOfElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size");
	int n= sc.nextInt();
	int[] arr= new int[n];
	
	for(int i =0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int sum = Calculation(arr);
	System.out.println("Sum of number "+ sum);
}
public static int Calculation(int[] arr) {
	int sum =0;
	for(int num:arr) {
		sum+=num;
	}

return sum;

}
}
