package hw2;

public class Hw2_7 {
	public static void main(String[] args) {
		char a = 'A';//使用字元
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
			}
			System.out.println();
			a++;//換一行後遞增
		}
	}
}
