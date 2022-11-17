import java.util.Scanner;
public class L1Q7 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = sc.nextInt();
        String arr[] = new String[n+1];
        System.out.println("Enter the lines: ");
        for (int i=0;i<=n;i++)
            arr[i]=sc.nextLine();
        System.out.println("\nLines in reverse: \n");
        for (int i=n;i>=0;i--)
            System.out.println(arr[i]);
    }    
}
