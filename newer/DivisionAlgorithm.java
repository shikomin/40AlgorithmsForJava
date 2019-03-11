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
		int greatestCommonDivisor=0;
		greatestCommonDivisor=DivisionAlg(n,m);
		System.out.println("Greatest common divisor:"+greatestCommonDivisor);
	}
	
	//找最大公因数的方法------//因为之后还会用到，所以作为方法调用-----
	public static int DivisionAlg(int x1,int x2) {
		int max=(x1>x2)?x1:x2;
		int min=(x1<x2)?x1:x2;
		int temp=min;
		for(int i=1;min!=0;i++) {
			min=max%min;
			max=temp;
			if(min==0) {
				break;
			}
			temp=min;
		}
		return temp;
	}
	
}
