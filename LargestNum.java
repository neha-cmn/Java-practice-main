package prgm1;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a :");
		int a =sc.nextInt();
        System.out.println("Enter number b :");
        int b =sc.nextInt();
        System.out.println("Enter number c :");
        int c =sc.nextInt();
        System.out.println("largest number is:");
        if( a > b && a > c ) {
        	System.out.println(a);
        }
        else if( b > a && b > c ) {
        	System.out.println(b);
        }
        else {
        	System.out.println(c);
        }
	}

}
