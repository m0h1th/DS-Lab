import java.util.Scanner;

public class L2Q1
{
	public static void ISort(int arr[])
	{
		int k,i;
		for(int j=1;j<arr.length;j++)
		{
			k = arr[j];
			i = j-1;
			while (i>=0 && arr[i]>k)
			{
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=k;
		}
		System.out.println("Array sorted...");
		for (i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n");
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for (int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		ISort(arr);
		int qarray[] = {10,5,24,89,12,3};
		ISort(qarray);
	}
}
