package algorithm40ForJava;

/**
 * ������ �������ڹ�������Լ������ĳ��ȴ�������
 * 
 * @author ������
 *
 */

public class Fraction {
	private int p; // numerator����
	private int q; // Denominator��ĸ

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
	 * ȡ�÷�����ʵ����ֵ
	 * 
	 * @return
	 */
	public double value() {
		return (double) p / (double) q;
	}

	/**
	 * �Ӹ���
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
	 * ͨ��
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public Fraction ReductionOfFractions(Fraction x) {
		Fraction y = new Fraction();
		int op = x.getP();
		int oq = x.getQ();
		// շת��������·��ӷ�ĸ�����Լ��
		int greatestCommonDivisor = DivisionAlgorithm.DivisionAlg(op, oq);
		// ���ӷ�ĸ�������Լ��
		op = op / greatestCommonDivisor;
		oq = oq / greatestCommonDivisor;
		y.setP(op);
		y.setQ(oq);
		return y;
	}

	/**
	 * ����ӷ�
	 * 
	 * @param x1
	 * @param x2
	 * @return
	 */

	public Fraction addition(Fraction x1, Fraction x2) {
		Fraction y = new Fraction();
		y.setP(x1.getP() * x2.getQ() + x2.getP() * x1.getQ()); // �·���
		y.setQ(x1.getQ() * x2.getQ()); // �·�ĸ

		// ͨ��
		y = this.ReductionOfFractions(y);

		return y;
	}

	/**
	 * �������(���ӷ�������)
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
	 * ����˷�
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
	 * �������(���˷�������)
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
