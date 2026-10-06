package prgm1;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter Principal:");
	double P=sc.nextDouble();
	System.out.println("Enter Rate:");
	double R=sc.nextDouble();
	System.out.println("Enter Time:");
	double T=sc.nextDouble();
double SI=(P*R*T)/100;
System.out.println("Simple Intrest="+SI);
	}

}
