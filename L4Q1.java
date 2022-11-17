import java.util.Scanner;

public class L4Q1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        mergesort(arr,0,n-1);
        System.out.println("Array sorted:");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void mergesort(int arr[],int p,int r)
    {
        if (p<r)
        {
            int q = (p+r)/2;
            mergesort(arr,p,q);
            mergesort(arr,q+1,r);
            merge(arr,p,q,r);
        }
    }

    public static void merge(int arr[],int p,int q,int r)
    {
        int n1 = q-p + 1;
        int n2 = r-q;
        int left[] = new int[n1+1];
        int right[] = new int[n2+2];
        for (int i=0;i<n1;i++)
            left[i] = arr[p+i];
        for (int i=0;i<n2;i++)
            right[i] = arr[q+i+1];
        left[n1] = Integer.MAX_VALUE;
        right[n2] = Integer.MAX_VALUE;
        int i=0,j=0;
        for (int k=p;k<=r;k++)
        {
            if (left[i]<=right[j])
                arr[k] = left[i++];
            else
                arr[k] = right[j++];
        }
    }
}
