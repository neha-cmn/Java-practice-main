package prgm1;

import java.util.Scanner;

public class IfEkseCalci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		double num1=sc.nextDouble();
		System.out.println("Enter num2:");
		double num2=sc.nextDouble();
		System.out.println("Enter operator(+,-,*,%):");
		char operator=sc.next().charAt(0);
	double result;
	if(operator == '+') {
		result=num1+num2;
		System.out.println("RESULT="+result);
	}
	else if(operator =='-') {
        result=num1-num2;
        System.out.println("RESULT="+result);
	}
	else if(operator == '*'){
		result=num1*num2;
		System.out.println("RESULT="+result);
		}
	else if(operator =='%') {
		result=num1%num2;
		System.out.println("RESULT="+result);
	}
	else
		System.out.println("INVALID RESULT");
	}
}
