public class L5Q4
{
    public static void main(String args[])
    {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s2.push(5);
        s2.push(6);
        System.out.println("Stack 1 contents: ");
        while (!s1.isEmpty())
        {
            System.out.println(s1.pop());
        }
        System.out.println("Stack 2 contents: ");
        while (!s2.isEmpty())
        {
            System.out.println(s2.pop());
        }
    }
}

class Stack
{
    static int stack[] = new int[100];
    static int freelist[] = new int[100];
    int indeces[] = new int[100];
    int top;

    Stack()
    {
        top = -1;
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            int item = stack[indeces[top]];
            top--;
            return item;
        }
    }

    public void push(int item)
    {
        int i;
        for (i=0;i<100;i++)
        {
            if (freelist[i] != 1)
            {
                stack[i] = item;
                indeces[++top] = i;
                freelist[i] = 1;
                break;
            }
        }
        if (i==100)
            System.out.println("Stack is full");
    }

    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            return stack[indeces[top]];
        }
    }

    public boolean isEmpty()
    {
        return top == -1;
    }
}