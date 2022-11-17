//Program to find the gcd of two numbers using Euclid's algorithm
import java.util.Scanner;

public class L3Q2
{
	public static int gcd(int a, int b)
	{
		if (b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt(), b = sc.nextInt();
		int x = gcd(a,b);
		System.out.println("The GCD of "+a+" and "+b+" is: "+x);
	}
}
