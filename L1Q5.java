import java.util.Scanner;

public class L1Q5
{
	public static void findpairs(int arr[])
	{
		for (int i=0;i<arr.length;i++)
			for (int j=0;j<arr.length;j++)
				if (arr[i]!=arr[j] && (arr[i]*arr[j])%2==0)
				{
					System.out.println("Pair found: ("+arr[i]+","+arr[j]+")");
					return;
				}
		System.out.println("Pair not found");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array: ");
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		findpairs(arr);
	}
}
