package prgm1;
import java.util.Scanner;
public class LargestSmallest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n1,n2,n3:");
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		int n3=scanner.nextInt();
		int max = n1;
        if (n2 > max) {
            max = n2;
        }
 
        if (n3 > max) {
            max = n3;
        }
        int min=n1;
        if(n2<min) {
        	min=n2;
        }
        if(n3<min) {
        	min=n3;
        }
	System.out.println("Largest number="+max);
	System.out.println("Smallest number="+min);
	}

}
