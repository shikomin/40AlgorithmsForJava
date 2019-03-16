package algorithm40ForJava;
/**
 * 一个整数，它加上100后是一个完全平方数，加上168又是一个完全平方数，请问该数是多少？   
 * @author 86151
 *
 */
public class CompleteSquares {

	public static void main(String[] args) {
		System.out.println("完全平方数:");
		double s1=0;
		double s2=0;
		for(int i=1;i<100000;i++) {
			s1=Math.sqrt(i+100);
			s2=Math.sqrt(i+268);
			if(isInt(s1) && isInt(s2)) {
				System.out.println("这个数是:"+i);
			}
		}
	}
	
	public static boolean isInt(double x) {
		double d=0;
		d=x%1;
		if(d==0) {
			return true;
		}else {
			return false;
		}	
	}

}
