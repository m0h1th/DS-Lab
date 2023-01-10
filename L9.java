public class L9 
{
    public static void main(String args[])
    {

    }
}

class TreeNode
{
    private int data;
    private TreeNode left;
    private TreeNode right;

    TreeNode(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setLeft(TreeNode left)
    {
        this.left = left;
    }
    public void setRight(TreeNode right)
    {
        this.right = right;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public TreeNode getLeft()
    {
        return left;
    }
    public TreeNode getRight()
    {
        return right;
    }
    public int getData()
    {
        return data;
    }
}

class BinSearchTree
{
    TreeNode root;
    BinSearchTree()
    {
        root = null;
    }

    BinSearchTree(TreeNode root)
    {
        this.root = root;
    }

    BinSearchTree(int data)
    {
        root = new TreeNode(data);
    }

    public void insert(int data)
    {
        if(root == null)
        {
            root = new TreeNode(data);
            return;
        }
        TreeNode temp = root;
        while(true)
        {
            if(data < temp.getData())
            {
                if(temp.getLeft() == null)
                {
                    temp.setLeft(new TreeNode(data));
                    return;
                }
                temp = temp.getLeft();
            }
            else
            {
                if(temp.getRight() == null)
                {
                    temp.setRight(new TreeNode(data));
                    return;
                }
                temp = temp.getRight();
            }
        }
    }

    public void delete(int data)
    {
        TreeNode temp = root;
        TreeNode parent = null;
        while (temp!=null)              //Traversing to get to the node to be deleted
        {
            if (temp.getData()==data)
                break;
            else if (temp.getData()>data)
            {
                parent = temp;
                temp = temp.getRight();
            }
            else
            {
                parent = temp;
                temp = temp.getLeft();
            }
        }
        if (temp==null)
        {
            System.out.println("Element not found");
            return;
        }
        if (temp.getLeft()==null && temp.getRight()==null)    //Leaf node case
        {
            if (parent.getLeft().getData()==data)
                parent.setLeft(null);
            else
                parent.setRight(null);
        }
        else if (temp.getLeft==null && temp.getRight!=null)    //Single child case 1
        {
            parent.setData(temp.getData());
            parent.setRight(null);
        }
        else if (temp.getLeft!=null && temp.getRight==null)    //Single child case 2
        {
            parent.setData(temp.getData());
            parent.setLeft(null);
        }
        else
        {
            TreeNode succ = temp.getRight();
            TreeNode succparent = temp;
            while (succ.getLeft()!=null)
            {
                succparent = succ;
                succ = succ.getLeft();
            }
            temp.setData(succ.getData());
            succparent.setLeft(null);
        }
    }

    public boolean search(int data)
    {
        TreeNode temp = root;
        while (temp!=null)
        {
            if (temp.getData()==data)
                return true;
            else if (temp.getData()<data)
                temp = temp.getRight();
            else
                temp = temp.getLeft();
        }
        return false;
    }
}