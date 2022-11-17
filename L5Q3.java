import java.util.Scanner;

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

public class L5Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter postfix expression (with spaces): ");
		String exp = sc.nextLine();
		int result = postfixeval(exp);
		System.out.println("The result is: "+result);
	}

	public static int postfixeval(String exp)
	{
		String e[] = exp.split(" ",-2);
		Stack s = new Stack();
		int op1, op2;
		for (int i=0; i<e.length;i++)
		{
			if (e[i].equals("+"))
				s.push(s.pop() + s.pop());
			else if (e[i].equals("-"))
			{
				op1 = s.pop();
				op2 = s.pop();
				s.push(op2-op1);
			}
			else if (e[i].equals("*"))
				s.push(s.pop()*s.pop());
			else if (e[i].equals("/"))
			{
				op1 = s.pop();
				op2 = s.pop();
				s.push(op2/op1);
			}
			else
				s.push(Integer.valueOf(e[i]));
		}
		return s.pop();
	}
}


