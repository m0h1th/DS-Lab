import java.util.Scanner;

public class L1Q2
{
	public static int linearsearch(int arr[], int k)
	{
		for (int i=0;i<arr.length;i++)
			if (arr[i]==k)
				return i;
		return -1;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array: ");
		for (int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the key: ");
		int k = sc.nextInt();
		System.out.println("Linear search returned: " + linearsearch(arr,k));
	}
}
