package algorithm40ForJava;
/**
 * ��Ŀ����5��������һ��
 * �ʵ�����˶����ꣿ
 * ��˵�ȵ�4���˴�2�ꡣ
 * �ʵ�4����������
 * ��˵�ȵ�3���˴�2�ꡣ
 * �ʵ������ˣ���˵�ȵ�2�˴����ꡣ
 * �ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ
 * ����ʵ�һ���ˣ���˵��10�ꡣ
 * ���ʵ�����˶��   
 * @author 86151
 *
 */
public class RecursionProb2 {

	public static void main(String[] args) {
		int[] age=new int[5];
		for(int i=0;i<age.length;i++) {
			System.out.println("��"+(i+1)+"����"+FindAge(i+1)+"��");
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
