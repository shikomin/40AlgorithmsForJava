package algorithm40ForJava;

/**
 * 自定义矩阵类 行rows 列cols 数据data
 * Matrix(int rows,int cols)为构造方法
 * showMat()显示矩阵的方法
 * addDiagonal(Matrix a)求矩阵对角线上元素之和
 * @author 胥珂铭
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
			System.out.println("不是n*n方阵，不能进行此操作");
			return 0;
		}
		double sum=0;
		for(int i=0;i<rows;i++) {
			sum=sum+a.data[i][i];
		}
		return sum;
	}

}
