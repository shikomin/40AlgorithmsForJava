package algorithm40ForJava;

public class MonkeyEatPeach {

	public static void main(String[] args) {
		int s=1;
		for(int i=9;i>=1;i--) {
			s=(s+1)*2;
		}
		System.out.println("第一天共摘了"+s+"个桃子");
	}

}
