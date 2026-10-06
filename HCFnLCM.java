package prgm1;
import java.util.Scanner;
public class HCFnLCM {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
System.out.println("Enter number a:");
int a=input.nextInt();
System.out.println("Enter number b:");
int b=input.nextInt();
int hcf=1;
for(int i=1;i<a && i<=b;i++)
	if(a%i==0 && b%i==0)
{
	hcf=i;
}
int lcm=(a*b)/hcf;
System.out.println("HCF="+hcf);
System.out.println("LCM="+lcm);
	}

}
