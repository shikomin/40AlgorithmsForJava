package algorithm40ForJava;

public class TestFraction {

	public static void main(String[] args) {
		Fraction x1=new Fraction();
		Fraction x2=new Fraction();
		Fraction y=new Fraction();
		
		x1.setP(1);
		x1.setQ(2);
		
		x2.setP(1);
		x2.setQ(3);
		
		y=y.addition(x1, x2);
		
		System.out.println(" "+y.getP()+"/"+y.getQ());
	}

}
