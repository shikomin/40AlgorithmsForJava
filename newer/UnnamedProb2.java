package algorithm40ForJava;

import java.util.Scanner;


/**
 * ��Ŀ��һ��5λ�����ж����ǲ��ǻ�������
 * ��12321�ǻ���������λ����λ��ͬ��ʮλ��ǧλ��ͬ��   
 * @author 86151
 *
 */
public class UnnamedProb2 {

	public static void main(String[] args) {
		System.out.println("����һ��������5λ��������:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = 0;
		int index = 0;
		for (int i = 4; i >= 1; i--) {
			r = num / (int) Math.pow(10, i);
			if (r != 0) {
				System.out.println("�������һ��" + (i + 1) + "λ��");
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
			System.out.println("�ǻ�����");
		}else {
			System.out.println("���ǻ�����");
		}
		
	}
	
}
