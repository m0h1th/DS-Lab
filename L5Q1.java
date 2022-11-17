import java.util.Scanner;
public class L5Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an expression: ");
		String exp = sc.nextLine();
		if (balanced(exp))
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is unbalanced");
	}

	public static boolean balanced(String exp)
	{
		char x;
		String open = new String("([{");
		String close = new String(")]}");
		CharStack s = new CharStack(exp.length());
		for (int i=0; i<exp.length(); i++)
		{
			if (open.indexOf(exp.charAt(i))!=-1)
				s.push(exp.charAt(i));
			else if (close.indexOf(exp.charAt(i))!=-1)
			{
				if (s.isEmpty())
					return false;
				x = s.pop();
				if (close.indexOf(exp.charAt(i)) != open.indexOf(x))
					return false;
			}
		}
		if (s.isEmpty())
			return true;
		return false;
	}
}

class CharStack
{
	private char stack[];
	private int top;

	CharStack()
	{
		stack = new char[100];
		top = -1;
	}

	CharStack(int size)
	{
		stack = new char[size];
		top = -1;
	}

	void push(char item)
	{
		if (top>=stack.length)
			System.out.println("Overflow");
		else
			stack[++top] = item;
	}

	char pop()
	{
		if (top==-1)
			System.out.println("Stack is empty");
		else
			return stack[top--];
		return '\0';
	}

	char peek()
	{
		if (top!=-1)
			return stack[top];
		else
			System.out.println("Stack is empty");
		return '\0';
	}

	boolean isEmpty()
	{
		if (top==-1)
			return true;
		return false;
	}
}
