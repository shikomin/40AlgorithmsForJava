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
	
	/**
	 * �η��������Ժ���������һ��쳲���������
	 * ����1ָ����쳲����������е��ĸ��±꿪ʼ������2ָ�����鳤��
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
