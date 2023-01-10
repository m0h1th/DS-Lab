//Create a linked list that stores numbers in sorted order.
import java.util.Scanner;
public class LabTest 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedListSorted mylist = new LinkedListSorted();
        System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit");
        int ch = sc.nextInt();
        while (ch<4)
        {
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the element: ");
                    mylist.insert(sc.nextInt());
                    System.out.println("Element inserted successfully!\n");
                    break;
                case 2:
                    System.out.print("Enter index to be deleted: ");
                    mylist.delete(sc.nextInt());
                    System.out.println("Element deleted successfully!\n");
                    break;
                case 3:
                    mylist.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("1. Insert\n2. Delete\n3. Display\n4. Exit");
            ch = sc.nextInt();
        }
        sc.close();
    }
}

class Node
{
    private int data;
    private Node next;

    Node(){}

    Node(int data)
    {
        this.data = data;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    
    public int getData(){return data;}
    public Node getNext(){return next;}
    public void setData(int data){this.data = data;}
    public void setNext(Node next){this.next = next;}
}

class LinkedListSorted
{
    private Node head;

    LinkedListSorted()
    {
        head = null;
    }

    public void insert(int item)
    {
        if (head==null)
            head = new Node(item);
        else if (head.getData()>item)
            head = new Node(item,head);
        else
        {
            Node curr = head;
            while (curr.getNext()!=null && curr.getNext().getData()<=item)
                curr = curr.getNext();
            Node newnode = new Node(item, curr.getNext());
            curr.setNext(newnode);
        }
    }

    public void delete(int key)
    {
        Node curr = head;
        for (int i=0;i<key-1;i++)
            curr = curr.getNext();
        curr.setNext(curr.getNext().getNext());
    }

    public void display()
    {
        if (head==null)
        {
            System.out.println("Empty");
            return;
        }
        Node curr = head;
        while (curr!=null)
        {
            System.out.print(curr.getData()+" -> ");
            curr = curr.getNext();
        }
        System.out.println("null");
    }
    public Node getHead()
    {
        return head;
    }
}