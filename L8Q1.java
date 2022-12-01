import java.util.Scanner;

public class L8Q1
{
	public static void main(String args[])
	{
		LinkedList mylist = new LinkedList();
		mylist.inserttotail(1);
		mylist.inserttotail(2);
		mylist.inserttotail(3);
		mylist.display();

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

	public void delete_key(int key)
	{
		if (head==null)
		{
			System.out.println("Empty");
			return;
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
		prev.setNext(curr.getNext());
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
