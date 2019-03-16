package algorithm40ForJava;

import java.util.Scanner;


/**
 * 题目：一个5位数，判断它是不是回文数。
 * 即12321是回文数，个位与万位相同，十位与千位相同。   
 * @author 86151
 *
 */
public class UnnamedProb2 {

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
		int[] nums = new int[index + 1];
		int[] invers = new int[index + 1];
		for (int i = 0; i <= index; i++) {
			r = num / (int) Math.pow(10, index - i);
			num = num % (int) Math.pow(10, index - i);
			nums[i] = r;
		}

		for (int i = index; i >= 0; i--) {
			invers[index - i] = nums[i];
		}
		int count=0;
		for (int i = 0; i <=index; i++) {
			if(invers[i]==nums[i]) {
				count++;
			}
		}
		if(count==index+1) {
			System.out.println("是回文数");
		}else {
			System.out.println("不是回文数");
		}
		
	}
	
}
