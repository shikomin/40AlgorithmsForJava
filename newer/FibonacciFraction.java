package algorithm40ForJava;

import java.util.Arrays;

/**
 * 斐波那契分数形式级数求部分和问题 
 * 即:2/1+3/2+5/3+8/5+13/8+21/13...
 * 可能出现的问题:因为当n增大时每项的分子分母非常大，做代数运算之后会出现错误结果。
 * 这是因为我在定义分数类时给分子分母设的是int类型的数据，而int类型数据不够存储太大的整数。
 * 所以在这题中，我只取了前10项的和。
 * 当然你可以很弱智的直接每项求数值再累加，但是那会直接损失精度。
 * 我特意写一个分数对象的初衷就是为了竟可能的减小精度的损失。
 * @author 胥珂铭
 *
 */
public class FibonacciFraction {

	public static void main(String[] args) {
		int[] parr=new int[10];  //分子
		int[] qarr=new int[10];  //分母
		
		parr=Fibonacci.CreatFibonacci(3, 10);
		System.out.println("分子:"+Arrays.toString(parr));
		qarr=Fibonacci.CreatFibonacci(2, 10);
		System.out.println("分母:"+Arrays.toString(qarr));
		
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
		
		System.out.println("分数形式结果:"+sum.getP()+"/"+sum.getQ());
		
		double s=sum.value();
		System.out.println("小数形式结果:"+s);
	}

}


