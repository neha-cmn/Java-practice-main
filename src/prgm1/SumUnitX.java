package prgm1;
import java.util.Scanner;
public class SumUnitX {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sum=0;
	while(true)
	{
		System.out.println("enter number or x to stop:");
		String value=input.next();
		
		if(value.equals("x")) {
			break;
		}
		int number=Integer.parseInt(value);
		sum=sum+number;
		
	}
	System.out.println("SUM="+sum);
	}
}
