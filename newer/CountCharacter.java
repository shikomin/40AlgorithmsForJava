package algorithm40ForJava;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		//ͳ���ַ�
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ�");
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
		System.out.println("Ӣ����ĸ����:"+alphabets+"��");
		System.out.println("���ֹ���:"+numbers+"��");
		System.out.println("�ո���:"+blank+"��");
		System.out.println("�����ַ�����:"+others+"��");
	}

}
