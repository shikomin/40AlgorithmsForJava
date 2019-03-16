package algorithm40ForJava;

import java.util.Arrays;

public class Sorttest {
	
	public static void main(String[] args) {
		int[] unsorted={7,9,2,4,10,5,6,1,8,3};
		System.out.println("≈≈–Ú«∞"+Arrays.toString(unsorted));
		int[] sorted=new int[10];
		int temp=0;
		for(int i=0;i<unsorted.length;i++){
			sorted[i]=unsorted[i];
			for(int j=i;j>0;j--) {
				if(sorted[j-1]>sorted[j]) {
					temp=sorted[j];
					sorted[j]=sorted[j-1];
					sorted[j-1]=temp;
				}
			}
		}
		System.out.println("≈≈–Ú∫Û"+Arrays.toString(sorted));
	}

}
