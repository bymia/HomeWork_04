package hw2;

public class Hw2_3 {
    public static void main(String[] args) {
    	int mul = 1, i = 1;
    	while(i <= 10) {  		
    		mul*=i;
    		i++;
    	}
    	System.out.println("1~10的連乘積:" + mul);
    }
}
