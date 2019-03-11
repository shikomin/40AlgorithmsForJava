package algorithm40ForJava;

public class PrintRhombus {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i <= 4 && j <= i * 2 - 1) {
					System.out.print("*");
				} else if (i > 4 && j <= (7 - i) * 2 + 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
