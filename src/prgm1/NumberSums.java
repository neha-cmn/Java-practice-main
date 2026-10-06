package prgm1;
import java.util.Scanner;
public class NumberSums {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int sumNegative = 0;
	        int sumEven = 0;
	        int sumOdd = 0;

	        System.out.println("Enter numbers (0 to stop):");

	        while (true) {

	            int n = scanner.nextInt();

	            if (n == 0) {
	                break;
	            }

	            if (n < 0) {
	                sumNegative = sumNegative + n;
	            }
	            else if (n % 2 == 0) {
	                sumEven = sumEven + n;
	            }
	            else {
	                sumOdd = sumOdd + n;
	            }
	        }

	        System.out.println("Sum of negative numbers = " + sumNegative);
	        System.out.println("Sum of positive even numbers = " + sumEven);
	        System.out.println("Sum of positive odd numbers = " + sumOdd);
	    }
	}
	


