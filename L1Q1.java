import java.util.Scanner;

public class L1Q1
{
	public static int smallest(int arr[])
	{
		int s=arr[0];
		for (int i=0;i<arr.length;i++)
			if (arr[i]<s)
				s=arr[i];
		return s;
	}

	public static int largest(int arr[])
	{
		int l=arr[0];
		for (int i=0;i<arr.length;i++)
			if (arr[i]>l)
				l=arr[i];
		return l;
	}

	public static void main(String args[])
	{
		int arr[] = new int[10];
		System.out.println("Enter an array (size 10): ");
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("The largest number is: " + largest(arr));
		System.out.println("The smallest number is: " + smallest(arr));
	}
}
