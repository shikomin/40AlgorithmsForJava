package algorithm40ForJava;

import java.util.Arrays;

public class UnnamedProb3 {
	public static void main(String[] args) {
		int[] arr1= {7,3,2,5,9,4,10,1,8,6};
		int[] arr2=new int[10];
		int m=3;
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++) {
			if(i+m<arr1.length) {
				arr2[i+m]=arr1[i];
			}else {
				arr2[i-arr2.length+m]=arr1[i];
			}
			
		}
		System.out.println(Arrays.toString(arr2));
		
	}
}
