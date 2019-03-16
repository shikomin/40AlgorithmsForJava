package algorithm40ForJava;

import java.util.Arrays;

public class UnnamedProb4 {
	public static void main(String[] args) {
		int[] arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int mark=0;
		int count=0;
		int index=0;
		for(int t=0;t<10;t++) {	
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					mark++;
				}
				if(mark==3) {
					arr[i]=0;
					count++;
					mark=0;
				}
			}
			if(count==arr.length-1) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==1) {
						index=i;
					}
				}
				break;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("最后剩下的是第"+(index+1)+"个人");
	}
}
