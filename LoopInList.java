import java.util.Scanner;

public class LoopInList 
{
    public static void main(String args[])
    {
        //Creating a loop in the list
        LinkedList mylist = new LinkedList();
        mylist.inserttotail(1);
        mylist.inserttotail(2);
        mylist.inserttotail(3);
        mylist.inserttotail(4);
        Node head = mylist.getHead().getNext();
        Node tail = mylist.getTail();
        tail.setNext(head);
        System.out.println(mylist.checkLoop());
        //Creating a list with no loop
        LinkedList mylist2 = new LinkedList();
        mylist2.inserttotail(1);
        mylist2.inserttotail(2);
        mylist2.inserttotail(3);
        System.out.println(mylist2.checkLoop());
        //Testing with a list with one node
        LinkedList mylist3 = new LinkedList();
        mylist3.inserttotail(1);
        Node n = mylist3.getHead();
        n.setNext(n);
        System.out.println(mylist3.checkLoop());
        //Testing with two nodes
        LinkedList mylist4 = new LinkedList();
        mylist4.inserttotail(1);
        mylist4.inserttotail(2);
        System.out.println(mylist4.checkLoop());
    }
}



class Node
{
	private int data;
	private Node next;

	Node()
	{
		data = -1;
		next = null;
	}

	Node(int data)
	{
		this.data = data;
		next = null;
	}

	Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}

	Node(Node n)
	{
		this.data = n.data;
		this.next = n.next;
	}

	public int getData(){return data;}

	public void setData(int item){this.data = item;}

	public Node getNext(){return next;}

	public void setNext(Node next){this.next = next;}
}

class LinkedList
{
	Node head;

	LinkedList()
	{
		head = null;
	}
    LinkedList(Node head)
    {
        this.head = head;
    }

    public boolean checkLoop()
    {
        Node slow = head;
        Node fast = head;
        while (slow!=null && fast!=null && fast.getNext()!=null)
        {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow==fast)
                return true;
        }
        return false;
    }

    public Node getHead()
    {
        return head;
    }
    
    public Node getTail()
    {
        Node curr = head;
        while (curr.getNext()!=null)
            curr = curr.getNext();
        return curr;
    }

	public void inserttohead(int item)
	{
		if (head==null)
			head = new Node(item);
		else
		{
			Node new_head = new Node(item);
			new_head.setNext(head);
			head = new_head;
		}
	}

	public void inserttotail(int item)
	{
		if (head==null)
		{
			inserttohead(item);
			return;
		}
		Node tail = new Node(item);
		Node curr = head;
		while (curr.getNext()!=null)
			curr = curr.getNext();
		curr.setNext(tail);
	}

	public int searchkey(int key)
	{
		if (head==null)
		{
			System.out.println("Empty");
			return -1;
		}
		int i = 0;
		Node curr = head;
		while (curr!=null)
		{
			if (curr.getData()==key)
				return i;
			curr = curr.getNext();
			i++;
		}
		return -1;
	}

	public void deletefromhead()
	{
		if (head==null)
			System.out.println("Empty");
		else
			head = head.getNext();
	}

	public void deletefromtail()
	{
		if (head==null)
		{
			System.out.println("Empty");
			return;
		}
		Node curr = head;
		Node prev = null;
		while (curr.getNext()!=null)
		{
			prev = curr;
			curr = curr.getNext();
		}
		prev.setNext(null);
	}

	public void insert_after(int key, int item)
	{
		if (head==null)
		{
			System.out.println("Empty");
			return;
		}
		Node curr = head;
		int i = 0;
		while(curr.getNext()!=null && i!=key)
		{
			i++;
			curr = curr.getNext();
		}
		Node temp = new Node(item,curr.getNext());
		curr.setNext(temp);
	}

	public int delete_key(int key)
	{
		if (head==null)
		{
			System.out.println("Empty");
			return -1;
		}
		Node curr = head;
		Node prev = null;
		int i = 0;
		while (curr!=null && i!=key)
		{
			i++;
			prev = curr;
			curr = curr.getNext();
		}
		int tmp = curr.getData();
		prev.setNext(curr.getNext());
		return tmp;
	}

	public void display()
	{
		Node curr = head;
		while (curr!=null)
		{
			System.out.print(curr.getData()+" ");
			curr = curr.getNext();
		}
		System.out.println();
	}
}