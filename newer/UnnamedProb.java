package algorithm40ForJava;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 * 
 * @author 86151
 *
 */
public class UnnamedProb {

	public static void main(String[] args) {
		System.out.println("输入一个不多于5位的正整数:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0;
		int index = 0;
		for (int i = 4; i >= 1; i--) {
			r = num / (int) Math.pow(10, i);
			if (r != 0) {
				System.out.println("这个数是一个" + (i + 1) + "位数");
				index = i;
				break;
			}
		}
		int[] invers = new int[index + 1];

		for (int i = 0; i <= index; i++) {
			r = num / (int) Math.pow(10, index - i);
			num = num % (int) Math.pow(10, index - i);
			invers[i] = r;
		}

		for (int i = index; i >= 0; i--) {
			System.out.print(invers[i]);
		}
	}

}
