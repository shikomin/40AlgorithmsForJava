package algorithm40ForJava;
import java.util.*;
public class BonusProb {

	public static void main(String[] args) {
		System.out.println("��˾���𷢷�");
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		double profit=sc.nextDouble();  //����
		double remainder=0;
		double bonus=0;  //����
		if(profit>1000000) {
			remainder=profit-1000000;
			bonus=bonus+remainder*0.01;
			profit=profit-remainder;
		}
		if(profit>600000) {
			remainder=profit-600000;
			bonus=bonus+remainder*0.015;
			profit=profit-remainder;
		}
		if(profit>400000) {
			remainder=profit-400000;
			bonus=bonus+remainder*0.03;
			profit=profit-remainder;
		}
		if(profit>200000) {
			remainder=profit-200000;
			bonus=bonus+remainder*0.05;
			profit=profit-remainder;
		}
		if(profit>100000) {
			remainder=profit-100000;
			bonus=bonus+remainder*0.075;
			profit=profit-remainder;
		}
		if(profit<=100000) {
			bonus=bonus+profit*0.1;
		}
		System.out.println("��������Ϊ:"+bonus);
	}

}
