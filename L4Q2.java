import java.util.Scanner;
public class L4Q2 
{
    public static void main(String args[])
    {
        MyArray myarray = new MyArray(20);
        for (int i=1;i<15;i++)
            myarray.append(i);
        myarray.display();
        myarray.delete(10);
        myarray.display();
        myarray.insert(11,10);
        myarray.display();
        myarray.append(0);
        myarray.sort();
        myarray.display();
        System.out.println("Array length: "+myarray.length());
    }
}

class MyArray
{
    private int arr[];
    private int end;
    MyArray()
    {
        arr = new int[100];
        end = -1;
    }
    MyArray(int size)
    {
        arr = new int[size];
        end = -1;
    }

    void append(int item)
    {
        arr[++end] = item;
    }

    void insert(int item,int index)
    {
        if (index<arr.length && index>=0)
            arr[index] = item;
        else
            System.out.println("Invalid index");
    }

    void delete(int index)
    {
        if (index<arr.length && index>=0)
        {
            for (int i=index;i<end;i++)
            {
                arr[i] = arr[i+1];
            }
            end--;
        }
    }

    void display()
    {
        System.out.print("Array: ");
        for (int i=0;i<=end;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    void sort()
    {
        for (int j=1;j<=end;j++)
        {
            int k = arr[j];
            int i = j-1;
            while (i>=0 && k<=arr[i])
            {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = k;
        }
    }

    int length()
    {
        return end+1;
    }
}