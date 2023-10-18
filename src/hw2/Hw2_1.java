package hw2;

public class Hw2_1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 2; i <= 1000; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和:" + sum);
	}

}
