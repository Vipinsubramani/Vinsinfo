package vinsinfo;

public class vowels {
	public static void main(String[]args) {
		String a="kavi";
		System.out.println(countofvowels(a));
	}
	static int countofvowels(String str) {
		int count=0;
		 for (int i=0;i<str.length();i++) {
	            char ch=str.charAt(i);

	     if(ch=='a'||ch =='e'||ch =='i'||ch=='o'||ch=='u') { 
	                count++;
	 // another method:if("aeious".contains(str.charAt(i)+""))
	            }
	        }
		return count;
	}
}
