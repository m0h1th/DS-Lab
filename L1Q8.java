import java.util.Scanner;
public class L1Q8 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        checkevenprod(arr);
    }

    public static void checkevenprod(int arr[])
    {
        int n = arr.length;
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                if (arr[i]!=arr[j] && (arr[i]*arr[j])%2==0)
                {
                    System.out.println("Pair found: ("+arr[i]+","+arr[j]+")");
                    return;
                }
        System.out.println("Pair not found");
    }
}
