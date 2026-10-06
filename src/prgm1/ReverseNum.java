package prgm1;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be reversed:");
        int n=sc.nextInt(); // ex:n=1234
        int rev=0;
        while(n>0) {
        	int rem = n%10;  //  1234 % 10 = 4 so rem = 4
        	rev = rev * 10 + rem; // rev = 0*10+4 i.e 4
        	n=n/10; // n= 1234/10 i.e 123 so this number again runs till u get reversed number
        }
	System.out.print("Reversed number is : "+rev);
	}

}

