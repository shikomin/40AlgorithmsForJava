package algorithm40ForJava;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci����");
		System.out.println("��������(�������3):");
		Scanner month=new Scanner(System.in);
		int m=month.nextInt();
		int n1=1;
		int n2=1;
		int s=0;
		System.out.println("��1������������:1");
		System.out.println("��2������������:1");
		for(int i=1;i<=m-2;i++) {
			s=n1+n2;
			n1=n2;
			n2=s;
			System.out.printf("��%d������������:%d\n",i+2,s);
		}

	}
}
