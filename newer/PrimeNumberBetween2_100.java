package algorithm40ForJava;

public class PrimeNumberBetween2_100 {

	public static void main(String[] args) {
		System.out.println("100���ڵ���������");
		int n=0,isp=1;
		for(int i=2;i<=100;i++) {
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
