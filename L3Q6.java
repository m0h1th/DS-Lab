//Program to quick sort an array
import java.util.Scanner;

public class L3Q6
{
	public static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int arr[], int l, int n)
	{
		int pivot = arr[n];
		int i=l-1;
		for (int j=l;j<n;j++)
			if (arr[j]<=pivot)
			{
				i++;
				swap(arr,i,j);
			}
		swap(arr,i+1,n);
		return i+1;
	}

	public static void quicksort(int arr[],int l, int n)
	{
		if (l<n)
		{
			int m = partition(arr,l,n);
			quicksort(arr,l,m-1);
			quicksort(arr,m+1,n);
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter "+n+" elements: ");
		for (int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		quicksort(arr,0,arr.length-1);
		System.out.println("Array sorted");
		for (int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
