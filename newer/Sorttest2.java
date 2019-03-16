package algorithm40ForJava;

import java.util.Arrays;
import java.util.Scanner;

public class Sorttest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[3];
		System.out.println("输入3个数");
		for(int i=0;i<arr.length;i++) {
			System.out.println("输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		System.out.println("排序前"+Arrays.toString(arr));
		int[] sortedArr=new int[3];
		int temp;
		for(int i=0;i<arr.length;i++) {
			sortedArr[i]=arr[i];
			for(int j=i;j>0;j--) {
				if(sortedArr[j]>sortedArr[j-1]) {
					temp=sortedArr[j];
					sortedArr[j]=sortedArr[j-1];
					sortedArr[j-1]=temp;
				}
			}
		}
		System.out.println("排序后"+Arrays.toString(sortedArr));
	}

}
