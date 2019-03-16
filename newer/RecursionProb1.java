package algorithm40ForJava;

public class RecursionProb1 {

	public static void main(String[] args) {
		//递归求级数部分和s=a+aa+aaa...
		System.out.println("-------递归求值-------");
		double s=myfunc(5,5);
		System.out.println("s:"+s);

	}
	
	//递归函数
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
