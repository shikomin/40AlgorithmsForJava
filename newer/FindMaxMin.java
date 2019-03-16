package algorithm40ForJava;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入10个数");
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		int[] Max=new int[2];
		int[] Min=new int[2];
		Max[0]=arr[0];Max[1]=0;
		Min[0]=arr[0];Min[1]=0;
		int temp;
		for(int i=1;i<arr.length;i++) {
			if(Max[0]<arr[i]) {
				Max[0]=arr[i];
				Max[1]=i;
			}
			if(Min[0]>arr[i]) {
				Min[0]=arr[i];
				Min[1]=i;
			}
		}
		
		temp=arr[Max[1]];
		arr[Max[1]]=arr[0];
		arr[0]=temp;
		
		temp=arr[Min[1]];
		arr[Min[1]]=arr[9];
		arr[9]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

}
