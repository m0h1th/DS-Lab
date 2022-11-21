import java.util.Scanner;
public class L6Q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        checkpalindrome(str);
    }

    public static void checkpalindrome(String s)
    {
        CharStack stack = new CharStack(s.length());
        int i = 0;
        try
        {
            while (s.charAt(i) != 'Z')
            {
                stack.push(s.charAt(i));
                i++;
            }
        }
        catch (Exception e)
        {
            System.out.println("Format not followed");
            return;
        }
        i++;
        for (; i < s.length(); i++)
        {
            if (stack.pop() != s.charAt(i))
            {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}

class CharStack
{
    private char[] stack;
    private int top;
    private int size;

    public CharStack(int size)
    {
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    public void push(char c)
    {
        if (top == size - 1)
            System.out.println("Stack is full");
        else
            stack[++top] = c;
    }

    public char pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return '\0';
        }
        else
            return stack[top--];
    }

    public char peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty");
            return '\0';
        }
        else
            return stack[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size - 1;
    }
}