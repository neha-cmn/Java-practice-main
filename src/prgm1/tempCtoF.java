package prgm1;
import java.util.Scanner;
public class tempCtoF {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("enter temperature in c:");
	double tempc= input.nextDouble();
	double tempf= (tempc*9/5)+32;
	System.out.println(tempf);
	}
	// TODO Auto-generated method stub}

}
