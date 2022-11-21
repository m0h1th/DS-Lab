import java.util.Scanner;

class TwoStackQueue
{
	Stack inputbuffer;
	Stack outputbuffer;
	int check,size;

	TwoStackQueue()
	{
		inputbuffer = new Stack(100);
		outputbuffer = new Stack(100);
		check = 0;
		size = 100;
	}

	TwoStackQueue(int size)
	{
		inputbuffer = new Stack(size);
		outputbuffer = new Stack(size);
		check = 0;
		this.size = size;
	}

	public void enque(int item)
	{
		if (check!=size)
			inputbuffer.push(item);
		check++;
	}

	public int deque()
	{
		if (outputbuffer.isEmpty())
		{
			while (!inputbuffer.isEmpty())
				outputbuffer.push(inputbuffer.pop());
		}
		if (check!=0)
		{
			check--;
			return outputbuffer.pop();
		}
		System.out.println("Empty");
		return -1;
	}
}

class Stack
{
	private int stack[];
	private int top;

	Stack()
	{
		stack = new int[100];
		top = -1;
	}
	Stack(int size)
	{
		stack = new int[size];
		top = -1;
	}

	void push(int item)
	{
		stack[++top]=item;
	}

	int pop()
	{
		return stack[top--];
	}

	int peek()
	{
		return stack[top];
	}

	boolean isEmpty()
	{
		if (top==-1)
			return true;
		return false;
	}
}

public class L7Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		TwoStackQueue myque = new TwoStackQueue(10);
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