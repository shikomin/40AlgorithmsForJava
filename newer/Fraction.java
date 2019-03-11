package algorithm40ForJava;

/**
 * 分数类 此类用于构造分数以及分数的初等代数运算
 * 
 * @author 胥珂铭
 *
 */

public class Fraction {
	private int p; // numerator分子
	private int q; // Denominator分母

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	/**
	 * 取得分数的实际数值
	 * 
	 * @return
	 */
	public double value() {
		return (double) p / (double) q;
	}

	/**
	 * 加负号
	 * 
	 * @param x
	 * @return
	 */
	public Fraction negative(Fraction x) {
		Fraction y = new Fraction();
		y.setP(-x.getP());
		y.setQ(x.getQ());
		return y;
	}

	/**
	 * 通分
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public Fraction ReductionOfFractions(Fraction x) {
		Fraction y = new Fraction();
		int op = x.getP();
		int oq = x.getQ();
		// 辗转相除法求新分子分母的最大公约数
		int greatestCommonDivisor = DivisionAlgorithm.DivisionAlg(op, oq);
		// 分子分母除以最大公约数
		op = op / greatestCommonDivisor;
		oq = oq / greatestCommonDivisor;
		y.setP(op);
		y.setQ(oq);
		return y;
	}

	/**
	 * 定义加法
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */

	public Fraction addition(Fraction x1, Fraction x2) {
		Fraction y = new Fraction();
		y.setP(x1.getP() * x2.getQ() + x2.getP() * x1.getQ()); // 新分子
		y.setQ(x1.getQ() * x2.getQ()); // 新分母

		// 通分
		y = this.ReductionOfFractions(y);

		return y;
	}

	/**
	 * 定义减法(即加法逆运算)
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */
	public Fraction Subtraction(Fraction x1, Fraction x2) {
		Fraction y = new Fraction();
		y = addition(x1, negative(x2));
		return y;
	}

	/**
	 * 定义乘法
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */
	public Fraction Multiplication(Fraction x1, Fraction x2) {
		Fraction y = new Fraction();
		y.setP(x1.getP() * x2.getP());
		y.setQ(x1.getQ() * x2.getQ());
		y = this.ReductionOfFractions(y);
		return y;
	}

	/**
	 * 定义除法(即乘法逆运算)
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */
	public Fraction Division(Fraction x1, Fraction x2) {
		Fraction y = new Fraction();
		int temp = 0;
		temp = x2.getP();
		x2.setP(x2.getQ());
		x2.setQ(temp);
		y = this.Multiplication(x1, x2);
		return y;
	}

}
