import java.util.Scanner;

class CircularQueue
{
	private int q[];
	int front, rear;
	int size,check;

	CircularQueue()
	{
		q = new int[100];
		front = -1;
		rear = -1;
		size = 100;
		check = 0;
	}

	CircularQueue(int s)
	{
		q = new int[s];
		front = 0;
		rear = 0;
		size = s;
		check = 0;
	}

	public void enque(int item)
	{
		if (check==size)
			System.out.println("Overflow");
		else
		{
			q[rear++] = item;
			rear %= size;
			check++;
		}
	}

	public int deque()
	{
		if (check==0)
		{
			System.out.println("Empty");
			return -1;
		}
		int item = q[front++];
		front %= size;
		check--;
		return item;
	}
}

public class L7Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		CircularQueue myque = new CircularQueue(5);
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
					break;
				default:
					System.out.println("Invalid choice");
			}
		} while (choice!=3);
	}
}
