package algorithm40ForJava;

import java.util.Scanner;

/**
 * ��Ŀ����һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
 * 
 * @author 86151
 *
 */
public class UnnamedProb {

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
