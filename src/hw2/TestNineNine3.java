package hw2;

public class TestNineNine3 {
    public static void main(String[] args) {
    	int i = 1;
    	while(i <= 9) {
    		int j = 1;
    		do {
    			System.out.println(i + "*" + j + "=" + i*j + "\t");
    			j++;
    		}while (j <= 9);
    		i++;
    	}
    	System.out.println();
    }
}
