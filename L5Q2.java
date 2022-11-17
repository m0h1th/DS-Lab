import java.util.Scanner;
public class L5Q2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Infix expression (without spaces): ");
		String exp = sc.nextLine();
		String result = infix_postfix(exp);
		System.out.print("Postfix expression: ");
		System.out.println(result);
	}

	static int precedence(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return -1;
	}

	static String infix_postfix(String exp)
	{
		String result = new String("");
		CharStack s = new CharStack();
		for (int i=0; i< exp.length(); i++)
		{
			char c = exp.charAt(i);
			if (Character.isLetterOrDigit(c))
				result+=c;
			else if (c=='(')
				s.push(c);
			else if (c==')')
			{
				while(!s.isEmpty() && s.peek()!='(')
				{
					result += s.peek();
					s.pop();
				}
				s.pop();
			}
			else
			{
				while(!s.isEmpty() && precedence(s.peek()) >= precedence(c))
				{
					result +=s.peek();
					s.pop();
				}
				s.push(c);
			}
		}
		while(!s.isEmpty())
		{
			if (s.peek()=='(')
				return "Invalid";
			result += s.peek();
			s.pop();
		}
		return result;
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
