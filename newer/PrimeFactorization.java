package algorithm40ForJava;
import java.lang.Math;
import java.util.Scanner;
public class PrimeFactorization {

	public static void main(String[] args) {
		System.out.println("-----质因数分解算法-----");
		Scanner getNum=new Scanner(System.in);
		int n=getNum.nextInt();
		int m=n;                /*把n赋给m*/
		for(int i=2;i<=n;i++) {
			if(m%i==0&&IsPriemNum(i)) {                /*i整除m且i是否为素数*/
				for(int t=1;t<=n;t++) {
					if(m%i==0&&m!=i) {                /*i整除m且m不等于i，这是输出带乘号*/
						m=m/i;                        /*m除以i之后作为新的被除数*/
						System.out.printf("%d*",i);
					}else if(m%i==0&&m==i) {          /*i整除m且m等于i，这是输出不带乘号*/
						m=m/i;
						System.out.printf("%d",i);
					}
				}
			}
		}
	}
	
	/*用来判断x是否为素数的函数，返回值为boolean型*/
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
