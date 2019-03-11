package algorithm40ForJava;
import java.lang.Math;
public class PrimeNumTest {

	public static void main(String[] args) {
		int rOfx;
		int x=101;
		for(int i=2;i<=Math.sqrt(x);i++) {
			rOfx=x%i;
			if(rOfx==0) {
				System.out.println("this is not a prime number");
				return;
			}
		}
		System.out.println("this is a prime number");
	}

}
