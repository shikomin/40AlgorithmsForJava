package algorithm40ForJava;

import java.util.Scanner;

public class ScoresJudge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈë³É¼¨");
		double score=sc.nextDouble();
		String c = (score>=90)?"A":((score>=60)?"B":"C");
		System.out.println(c);
	}

}
