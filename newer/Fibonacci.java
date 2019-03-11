package algorithm40ForJava;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Fibonacci数列");
		System.out.println("输入月数(必须大于3):");
		Scanner month=new Scanner(System.in);
		int m=month.nextInt();
		int n1=1;
		int n2=1;
		int s=0;
		System.out.println("第1个月兔子总数:1");
		System.out.println("第2个月兔子总数:1");
		for(int i=1;i<=m-2;i++) {
			s=n1+n2;
			n1=n2;
			n2=s;
			System.out.printf("第%d个月兔子总数:%d\n",i+2,s);
		}

	}
}
