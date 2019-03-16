package algorithm40ForJava;

/**
 * �Զ�������� ��rows ��cols ����data
 * Matrix(int rows,int cols)Ϊ���췽��
 * showMat()��ʾ����ķ���
 * addDiagonal(Matrix a)�����Խ�����Ԫ��֮��
 * @author ������
 *
 */
public class Matrix {
	int rows;
	int cols;
	double[][] data = null;

	public Matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.data = new double[rows][cols];
	}

	public void showMat() {
		System.out.print("[");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(j!=cols-1) {
					System.out.print(data[i][j] + ",");
				}else {
					System.out.print(data[i][j]);
				}
			}
			if (i != rows - 1) {
				System.out.println();
			}
		}
		System.out.println("]");
	}
	
	public double addDiagonal(Matrix a) {
		if(a.rows!=a.cols) {
			System.out.println("����n*n���󣬲��ܽ��д˲���");
			return 0;
		}
		double sum=0;
		for(int i=0;i<rows;i++) {
			sum=sum+a.data[i][i];
		}
		return sum;
	}

}
