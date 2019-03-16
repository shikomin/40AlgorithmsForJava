package algorithm40ForJava;

public class YangHuiTriangle {

	public static void main(String[] args) {
		System.out.println("Êä³ö10ÐÐÑî»ÔÈý½Ç(Pascal's triangle)");
		int n=10;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(CombinationNum(j-1,i-1)+"\t");
			}
			System.out.println();
		}

	}
	
	public static int CombinationNum(int k,int n) {
		int a=1;
		int b=1;
		if(n==0) {
			return 1;
		}
		for(int i=n;i>n-k;i--) {
			a*=i;
			b*=(n+1-i);
		}
		return a/b;
	}
	
}
