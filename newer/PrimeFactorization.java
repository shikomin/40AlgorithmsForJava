package algorithm40ForJava;
import java.lang.Math;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("-----�������ֽ��㷨-----");
		Scanner getNum=new Scanner(System.in);
		int n=getNum.nextInt();
		int m=n;                /*��n����m*/
		for(int i=2;i<=n;i++) {
			if(m%i==0&&IsPriemNum(i)) {                /*i����m��i�Ƿ�Ϊ����*/
				for(int t=1;t<=n;t++) {
					if(m%i==0&&m!=i) {                /*i����m��m������i������������˺�*/
						m=m/i;                        /*m����i֮����Ϊ�µı�����*/
						System.out.printf("%d*",i);
					}else if(m%i==0&&m==i) {          /*i����m��m����i��������������˺�*/
						m=m/i;
						System.out.printf("%d",i);
					}
				}
			}
		}
	}
	
	/*�����ж�x�Ƿ�Ϊ�����ĺ���������ֵΪboolean��*/
	public static boolean IsPriemNum(int x) {
		int rOfx;
		for(int i=2;i<=Math.sqrt(x);i++) {
			rOfx=x%i;
			if(rOfx==0) {
				return false;
			}
		}
		return true;
	}

}
