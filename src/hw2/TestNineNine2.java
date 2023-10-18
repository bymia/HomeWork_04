package hw2;

public class TestNineNine2 {
    public static void main(String[] args) {
    	for(int i = 1; i <= 9; i++) {
    		int j = 1;
    		do {
    			System.out.println(i + "*" + j + "=" + i*j + "\t");
    			j++;
    		}while(j <= 9);
    		System.out.println();
    	}
    }
}
