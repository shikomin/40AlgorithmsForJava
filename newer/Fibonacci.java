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
	
	/**
	 * 次方法将在以后用来创造一个斐波那契数列
	 * 参数1指定从斐波那契数列中的哪个下标开始，参数2指定数组长度
	 * @return
	 */
	public static int[] CreatFibonacci(int a,int n) {
		int[] arr=new int[n];
		int x1=1;
		int x2=1;
		int s=1;
		for(int i=3;i<a+n;i++) {
			s=x1+x2;
			x1=x2;
			x2=s;
			if(i>=a) {
				arr[i-a]=s;
			}
		}
		if(a==2){
			arr[0]=1;
		}else if(a==1) {
			arr[0]=1;
			arr[1]=1;
		}
		return arr;
	}
	
	
}
