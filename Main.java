import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] arr =new int[26];
		for(int i=0;i<str.length();i++)
		{
		    arr[((int)str.charAt(i))-97]+=1;
		}
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]==0)continue;
		    System.out.print((char)(i+'a')+":"+arr[i]+" ");
		}
	}
}
