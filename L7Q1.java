import java.util.Scanner;

class LinearQueue
{
	private int q[];
	int rear;

	LinearQueue()
	{
		q = new int[100];
		rear = -1;
	}

	LinearQueue(int size)
	{
		q = new int[size];
		rear = -1;
	}

	public void enque(int item)
	{
		if (rear==q.length-1)
			System.out.println("Overflow");
		else
			q[++rear] = item;
	}

	public int deque()
	{
		if (rear==-1)
		{
			System.out.println("Empty");
			return -1;
		}
		int item = q[0];
		for (int i=0;i<rear;i++)
			q[i]=q[i+1];
		rear--;
		return item;
	}
}

public class L7Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		LinearQueue myque = new LinearQueue();
		int choice, item;
		do
		{
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice)
			{
				case 1:
					System.out.print("Enter the item to be enqueued: ");
					item = sc.nextInt();
					myque.enque(item);
					break;
				case 2:
					item = myque.deque();
					if (item!=-1)
						System.out.println("The dequeued item is: "+item);
					break;
				case 3:
					System.out.println("Exiting...");
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice!=3);
	}
}
