package prgm1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alphabet:");
		char Alphabet = sc.next().charAt(0);
        if(Alphabet>='A' && Alphabet<='Z') {
        	System.out.println("Alphabet is Uppercase");
        }
        else {
        	System.out.println("Alphabet is Lowercase");
        }
	}
}
