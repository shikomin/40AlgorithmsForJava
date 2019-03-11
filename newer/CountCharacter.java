package algorithm40ForJava;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		//统计字符
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一段字符");
		String s=sc.nextLine();
		int alphabets=0;
		int numbers=0;
		int blank=0;
		int others=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
				alphabets=alphabets+1;
			}else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
				numbers=numbers+1;
			}else if(s.charAt(i)==32) {
				blank=blank+1;
			}else {
				others=others+1;
			}
		}
		System.out.println("英文字母共有:"+alphabets+"个");
		System.out.println("数字共有:"+numbers+"个");
		System.out.println("空格共有:"+blank+"个");
		System.out.println("其他字符共有:"+others+"个");
	}

}
