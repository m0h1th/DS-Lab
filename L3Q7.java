//Bubble sort program
import java.util.Scanner;

public class L3Q7
{
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void bubblesort(int arr[])
	{
		int temp;
		int n = arr.length;
		for (int i=0;i<=n-2;i++)
		{
			int swapped = 0;
			for (int j=0;j<=n-2-i;j++)
				if (arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
					swapped = 1;
				}
			if (swapped==0)
				break;
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter "+n+" elements: ");
		int arr[] = new int[n];
		for (int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		bubblesort(arr);
		System.out.println("Array sorted");
		for (int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
