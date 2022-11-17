import java.util.Scanner;

public class L5Q5 
{
    public static void main(String args[])
    {
        Stack s1 = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter stack contents: ");
        for (int i=0;i<n;i++)
        {
            s1.push(sc.nextInt());
        }
        s1.reverse();
        System.out.println("Reversed stack contents: ");
        while (!s1.isEmpty())
        {
            System.out.println(s1.pop());
        }
    }
}

class Stack
{
	int stack[];
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

    void reverse()
    {
        Stack s2 = new Stack();
        while(!this.isEmpty())
            s2.push(this.pop());
        Stack s3 = new Stack();
        while(!s2.isEmpty())
            s3.push(s2.pop());
        while(!s3.isEmpty())
            this.push(s3.pop());
    }
}
