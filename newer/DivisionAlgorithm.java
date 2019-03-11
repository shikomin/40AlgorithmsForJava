package algorithm40ForJava;

import java.util.Scanner;

public class DivisionAlgorithm {

	public static void main(String[] args) {
		//շת��������������
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
	
	//����������ķ���------//��Ϊ֮�󻹻��õ���������Ϊ��������-----
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
