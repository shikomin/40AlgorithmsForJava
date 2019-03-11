package algorithm40ForJava;

public class Narcissistic_number {

	public static void main(String[] args) {
		int h=0,t=0,o=0;
			System.out.println("水仙花数");
		for(int i=100;i<=999;i++) {
			h=i/100;
			t=(i%100)/10;
			o=(i%100)%10;
			if(i==(h*h*h+t*t*t+o*o*o)) {
				System.out.printf("%d是水仙花数\n",i);
			}
		}
	}

}
