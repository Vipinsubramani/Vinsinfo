package vinsinfo;

public class secondlargest {
	static int[] sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
			
		}
		return arr;
	}
	public static void main(String[]args) {
		int[]nArr= {};
		System.out.println(nArr[nArr.length-2]);
	}

}
