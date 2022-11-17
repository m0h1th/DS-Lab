public class L4Q4 
{
    public static void main(String args[])
    {
        Stack mystack = new Stack(10);
        for (int i=1;i<=5;i++)
            mystack.push(i);
        while (!mystack.isEmpty())
            System.out.println(mystack.pop());
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