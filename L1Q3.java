import java.util.Scanner;

public class L1Q3
{
	public static int sumn(int n)
	{
		return n*(n+1)/2;
	}

	public static void main(String args[])
	{
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The sum of "+n+" natural numbers is : "+ sumn(n));
	}
}
