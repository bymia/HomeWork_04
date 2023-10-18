package hw2;

public class Hw2_5 {
    public static void main(String[] agrs) {
    	int sum = 0, num = 10;
    	for(int i = 1; i <=49; i++) {
    		if(i % num != 4 && i / num != 4) {
    			System.out.print(i + " ");
    			sum++;
    		}
    	}
    }
}
