package hw1;

public class Hw1_5 {
    public static void main(String[] args) {
    	double num = 1500000, r = 0.02;
    	int t = 10;//1500000*(1+2%)^10
    	double com = num*Math.pow((1+r), t);
    	System.out.println(com);
    }
}
