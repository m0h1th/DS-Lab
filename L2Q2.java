import java.util.Scanner;

public class L2Q2
{
	public static int Bsearch(int arr[], int k)
	{
		int start=0, end=arr.length-1;
		int mid = (start+end)/2;
		while (start<=end)
		{
			mid=(start+end)/2;
			if (arr[mid]==k)
				return mid;
			else if (arr[mid]>k)
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}

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
        }

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt(), i;
		int arr[] = new int[n];
		System.out.print("Enter the sorted array: ");
		for (i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the element to search for: ");
		int k = sc.nextInt();
		ISort(arr);
		for (i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		int ind = Bsearch(arr,k);
		if (ind!=-1)
		{
			for (i=0;i<ind;i++)
				System.out.print("  ");
			System.out.println("^");
		}
		System.out.println("Binary search returned: "+ind);
	}
}
