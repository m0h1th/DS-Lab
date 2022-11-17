import java.util.Scanner;

public class L1Q6 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = n;
        int count = 0;
        while (n>=2)
        {
            count++;
            n/=2;
        }
        System.out.println("The number of times 2 divides "+x+" is: "+count);
    }
}
