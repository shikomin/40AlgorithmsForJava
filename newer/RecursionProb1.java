package algorithm40ForJava;

public class RecursionProb1 {

	public static void main(String[] args) {
		//�ݹ��������ֺ�s=a+aa+aaa...
		System.out.println("-------�ݹ���ֵ-------");
		double s=myfunc(5,5);
		System.out.println("s:"+s);

	}
	
	//�ݹ麯��
	public static double myfunc(double a,int n) {
		double x=0;
		if(n==1) {
			return a;
		}else {
			for(int i=0;i<n;i++) {
				x=x+a*Math.pow(10, i);
			}
			return myfunc(a,n-1)+x;
		}
	}
}
