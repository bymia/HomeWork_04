package hw2;

public class Hw2_6 {
    public static void main(String[] args) {
    	
    	for(int i = 11; i >= 1; i--) {//i=11,外層比內層多一
    		for(int j = 1; j < i; j++) {
    			
    			System.out.print(j);
    		}
    		System.out.println();
    	}
    }
}
