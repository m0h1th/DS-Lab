//Recursive Program to find the factorial of a number
import java.util.Scanner;

public class L3Q1
{
	public static int factorial(int n)
	{
		if (n<=1)
			return 1;
		return n*factorial(n-1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int f = factorial(sc.nextInt());
		System.out.println("The factorial is: "+f);
	}
}
