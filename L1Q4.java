import java.util.Scanner;

public class L1Q4
{
	public static void prime(int n)
	{
		int flag=0;
		for (int i=1;i<=n;i++)
		{
			flag = 0;
			if (i>2)
				for (int j=2;j<i;j++)
					if (i%j==0)
						flag=1;
			if (flag==0)
				System.out.print(i+" ");
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.print("Primes numbers: ");
		prime(n);
	}
}
