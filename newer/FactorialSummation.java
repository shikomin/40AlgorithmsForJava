package algorithm40ForJava;

public class FactorialSummation {

	public static void main(String[] args) {
		int s=0;
		for(int i=1;i<=20;i++) {
			s=s+Factorial(i);
		}
		System.out.println("1!+2!+3!+...+20!="+s);
	}
	
	
	public static int Factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*Factorial(n-1);
		}
	}
}
