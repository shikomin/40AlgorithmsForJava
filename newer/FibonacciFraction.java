package algorithm40ForJava;

import java.util.Arrays;

/**
 * 쳲�����������ʽ�����󲿷ֺ����� 
 * ��:2/1+3/2+5/3+8/5+13/8+21/13...
 * ���ܳ��ֵ�����:��Ϊ��n����ʱÿ��ķ��ӷ�ĸ�ǳ�������������֮�����ִ�������
 * ������Ϊ���ڶ��������ʱ�����ӷ�ĸ�����int���͵����ݣ���int�������ݲ����洢̫���������
 * �����������У���ֻȡ��ǰ10��ĺ͡�
 * ��Ȼ����Ժ����ǵ�ֱ��ÿ������ֵ���ۼӣ������ǻ�ֱ����ʧ���ȡ�
 * ������дһ����������ĳ��Ծ���Ϊ�˾����ܵļ�С���ȵ���ʧ��
 * @author ������
 *
 */
public class FibonacciFraction {

	public static void main(String[] args) {
		int[] parr=new int[10];  //����
		int[] qarr=new int[10];  //��ĸ
		
		parr=Fibonacci.CreatFibonacci(3, 10);
		System.out.println("����:"+Arrays.toString(parr));
		qarr=Fibonacci.CreatFibonacci(2, 10);
		System.out.println("��ĸ:"+Arrays.toString(qarr));
		
		Fraction[] arr=new Fraction[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Fraction();
			arr[i].setP(parr[i]);
			arr[i].setQ(qarr[i]);
		}
		
		Fraction sum=new Fraction();
		sum=arr[0]; 
		for(int i=1;i<arr.length;i++) {
			sum=sum.addition(sum, arr[i]);
		}
		
		System.out.println("������ʽ���:"+sum.getP()+"/"+sum.getQ());
		
		double s=sum.value();
		System.out.println("С����ʽ���:"+s);
	}

}


