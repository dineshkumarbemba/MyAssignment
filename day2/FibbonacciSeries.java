package week1.day2;

public class FibbonacciSeries {
	public static void main(String[] args) {
		 int n = 8; 
	        int num1 = 0;
	        int num2 = 1;

	        System.out.print("Fibonacci Series: ");

	        for (int i = 1; i <= n; ++i) {
	            System.out.print(num1 + " ");

	            int sum = num1 + num2;
	            num1 = num2;
	            num2 = sum;
	        }
	    }
}

