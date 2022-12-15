public class EvenOnList 
{
    public static void main(String args[])
    {
        LinkedList mylist = new LinkedList();
        //Given a list of numberes 12 -> 9 -> 10 -> 5 -> 21
        //Write a function that prints nodes with even numbers in it.
        //Output: 
        //12 1
        //10 3
        mylist.inserttotail(12);
        mylist.inserttotail(9);
        mylist.inserttotail(10);
        mylist.inserttotail(5);
        mylist.inserttotail(21);
        mylist.printEven();

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

    public void printEven()
    {
        Node curr = head;
        int i = 1;
        while (curr!=null)
        {
            if (curr.getData()%2==0)
                System.out.println(curr.getData() + " " + i);
            curr = curr.getNext();
            i++;
        }
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
		if (i==0)
		{
			int tmp = head.getData();
			head = head.getNext();
			return tmp;
		}
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
