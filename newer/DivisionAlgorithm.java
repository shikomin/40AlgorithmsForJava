package algorithm40ForJava;

import java.util.Scanner;

public class DivisionAlgorithm {

	public static void main(String[] args) {
		//辗转相除法求最大公因数
		Scanner sc=new Scanner(System.in);
		System.out.println("input two integer:");
		System.out.println("input n:");
		int n=sc.nextInt();
		System.out.println("input m:");
		int m=sc.nextInt();
		int max=(n>m)?n:m;
		int min=(n<m)?n:m;
		int temp=min;
		for(int i=1;min!=0;i++) {
			min=max%min;
			max=temp;
			if(min==0) {
				break;
			}
			temp=min;
		}
		System.out.println("Greatest common divisor:"+temp);
	}

}
