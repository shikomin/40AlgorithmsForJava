package algorithm40ForJava;
import java.lang.Math;
public class PrimeNumberBetween101_200 {

	public static void main(String[] args) {
		System.out.println("101~200֮�����������");
		int n=0,isp=1;
		for(int i=101;i<=200;i++) {
			double num=i;
			for(int j=2;j<=Math.sqrt(num);j++) {
				if(i%j==0) {
					isp=0;
					break;
				}
			}
			if(isp==1) {
				System.out.printf("%d������\n",i);
				n++;
			}
			isp=1;
		}
		System.out.printf("����%d������",n);
	}

}
