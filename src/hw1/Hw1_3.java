package hw1;

public class Hw1_3 {
    public static void main(String[] args) {
    	int num1 = 256559;
    	int num2 = 60;
    	int num3 = 24;
    	int srem = num1%num2;
    	int min = num1/num2;
    	int hr = min/num2;
    	int hrem = min%num2;
    	int day = hr/num3;
    	int mrem = hr%num3;
    	
    	System.out.println(min);
    	System.out.println(srem);
    	System.out.println(hrem);
    	System.out.println(day);
    	System.out.println(mrem);
    	
    	
    	
    }
}
