package algorithm40ForJava;
/**
 * һ��������������100����һ����ȫƽ����������168����һ����ȫƽ���������ʸ����Ƕ��٣�   
 * @author 86151
 *
 */
public class CompleteSquares {

	public static void main(String[] args) {
		System.out.println("��ȫƽ����:");
		double s1=0;
		double s2=0;
		for(int i=1;i<100000;i++) {
			s1=Math.sqrt(i+100);
			s2=Math.sqrt(i+268);
			if(isInt(s1) && isInt(s2)) {
				System.out.println("�������:"+i);
			}
		}
	}
	
	public static boolean isInt(double x) {
		double d=0;
		d=x%1;
		if(d==0) {
			return true;
		}else {
			return false;
		}	
	}

}
