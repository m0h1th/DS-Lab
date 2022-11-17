//Program to find nth power of a number
import java.util.Scanner;

public class L3Q3
{
	public static int pow(int b, int p)
	{
		if (p==0)
			return 1;
		return b*pow(b,p-1);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int b = sc.nextInt();
		System.out.print("Enter the power: ");
		int p = sc.nextInt();
		System.out.println(b+" raised to "+p+" is: "+pow(b,p));
	}
}
