package algorithm40ForJava;
/**
 * 题目：有5个人坐在一起，
 * 问第五个人多少岁？
 * 他说比第4个人大2岁。
 * 问第4个人岁数，
 * 他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。
 * 问第2个人，说比第一个人大两岁。
 * 最后问第一个人，他说是10岁。
 * 请问第五个人多大？   
 * @author 86151
 *
 */
public class RecursionProb2 {

	public static void main(String[] args) {
		int[] age=new int[5];
		for(int i=0;i<age.length;i++) {
			System.out.println("第"+(i+1)+"个人"+FindAge(i+1)+"岁");
		}

	}
	
	public static int FindAge(int n) {
		if(n==1) {
			return 10;
		}else {
			return FindAge(n-1)+2;
		}
	}
}
