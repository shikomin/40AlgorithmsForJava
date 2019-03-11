package algorithm40ForJava;
import java.util.*;
public class BonusProb {

	public static void main(String[] args) {
		System.out.println("公司奖金发放");
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入利润");
		double profit=sc.nextDouble();  //利润
		double remainder=0;
		double bonus=0;  //奖金
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
		System.out.println("奖金总数为:"+bonus);
	}

}
