package algorithm40ForJava;

public class Series01 {

	public static void main(String[] args) {
		int times=10;
		double a=100;
		double s=0;
		s=myfunc(a,times);
		System.out.println("��ʮ�����ʱ��������:"+s+"��");
		System.out.println("��ʮ�η���:"+a*Math.pow(0.5, times-1)+"��");
	}
	
	public static double myfunc(double a,int n) {
		if(n==1) {
			return a;
		}else {
			return myfunc(a,n-1)+a*Math.pow(0.5, n-1);
		}
	}
}
