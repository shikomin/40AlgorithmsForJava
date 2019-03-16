package algorithm40ForJava;

import java.util.Scanner;

public class MatrixProb01 {
	
	public static void main(String[] args) {
		Matrix a=new Matrix(3,3);
		Scanner sc=new Scanner(System.in);
		System.out.println("输入矩阵:");
		
		for(int i=0;i<a.rows;i++) {
			for(int j=0;j<a.cols;j++) {
				System.out.println("输入矩阵第"+(i+1)+"行"+(j+1)+"列"+"元素的值");
				a.data[i][j]=sc.nextDouble();
			}
		}
		System.out.println("显示矩阵");
		a.showMat();
		
		double sum=a.addDiagonal(a);
		System.out.println("矩阵对角线元素之和为:"+sum);
	}

}
