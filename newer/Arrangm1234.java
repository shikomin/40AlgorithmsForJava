package algorithm40ForJava;
/**
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？   
 * @author 86151
 *
 */
public class Arrangm1234 {

	public static void main(String[] args) {
		
		int s=0;
		int temp1;
		int temp2;
		for(int h=1;h<=4;h++) {
			s=0;
			s=h*100;
			temp1=s;
			for(int t=1;t<=4;t++) {
				s=temp1;
				s=s+t*10;
				temp2=s;
				for(int o=1;o<=4;o++) {
					s=temp2;
					s=s+o;
					System.out.println(s);
				}
			}
		}
	}

}
