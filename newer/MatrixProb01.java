package algorithm40ForJava;

import java.util.Scanner;

public class MatrixProb01 {
	
	public static void main(String[] args) {
		Matrix a=new Matrix(3,3);
		Scanner sc=new Scanner(System.in);
		System.out.println("�������:");
		
		for(int i=0;i<a.rows;i++) {
			for(int j=0;j<a.cols;j++) {
				System.out.println("��������"+(i+1)+"��"+(j+1)+"��"+"Ԫ�ص�ֵ");
				a.data[i][j]=sc.nextDouble();
			}
		}
		System.out.println("��ʾ����");
		a.showMat();
		
		double sum=a.addDiagonal(a);
		System.out.println("����Խ���Ԫ��֮��Ϊ:"+sum);
	}

}
