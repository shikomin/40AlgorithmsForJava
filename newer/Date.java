package algorithm40ForJava;

import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		System.out.println("��������(��/��/��):");
		Scanner sc=new Scanner(System.in);
		System.out.println("������:");
		int y=sc.nextInt();
		System.out.println("������:");
		int m=sc.nextInt();
		System.out.println("������:");
		int d=sc.nextInt();
		int n=0;
		if(y%4==0) {
			n=31*(m>1?1:0)+29*(m>2?1:0)+31*(m>3?1:0)+30*(m>4?1:0)+31*(m>5?1:0)+30*(m>6?1:0)+31*(m>7?1:0)+31*(m>8?1:0)+30*(m>9?1:0)+31*(m>10?1:0)+30*(m>11?1:0)+d;
		}else {
			n=31*(m>1?1:0)+28*(m>2?1:0)+31*(m>3?1:0)+30*(m>4?1:0)+31*(m>5?1:0)+30*(m>6?1:0)+31*(m>7?1:0)+31*(m>8?1:0)+30*(m>9?1:0)+31*(m>10?1:0)+30*(m>11?1:0)+d;
		}
		
		System.out.println(" "+y+"��"+m+"��"+d+"��"+" ��"+y+"��ĵ�"+n+"��");
	}

}
