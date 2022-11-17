//Program to print the fibonacci series
import java.util.Scanner;

public class L3Q5
{
	public static int fibonacci(int n)
	{
		if (n<0)
			return 0;
		else if (n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void fibseries(int n)
	{
		for (int i=0;i<n;i++)
			System.out.print(fibonacci(i)+" ");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("Fibonacci series: ");
		fibseries(n);
		System.out.println();
	}
}
