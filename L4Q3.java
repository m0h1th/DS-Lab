public class L4Q3 
{
    public static void main(String args[])
    {
        int m[][] = {{1,2}, {3,4}};
        MyMatrix mymatrix = new MyMatrix(m);
        mymatrix.display();
    }
}

class MyMatrix
{
    int n,m;
    int matrix[][];
    MyMatrix(){}

    MyMatrix(int n, int m)
    {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
    }

    MyMatrix(int matrix[][])
    {
        this.n = matrix.length;
        this.m = matrix[0].length;
        this.matrix = matrix;
    }

    void add(MyMatrix a)
    {
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                matrix[i][j]+=a.matrix[i][j];
    }

    MyMatrix sum(MyMatrix a, MyMatrix b)
    {
        MyMatrix result = new MyMatrix(a.n,a.m);
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                result.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
        return result;
    }
    MyMatrix product(MyMatrix a, MyMatrix b)
    {
        MyMatrix result = new MyMatrix(a.n,b.m);
        for (int i=0;i<a.n;i++)
            for (int j=0;j<b.m;j++)
            {
                result.matrix[i][j] = 0;
                for (int k=0;k<a.m;k++)
                    result.matrix[i][j] = a.matrix[i][k] * b.matrix[k][j];
            }
        return result;
    }

    MyMatrix transpose()
    {
        MyMatrix result = new MyMatrix(m,n);
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                result.matrix[j][i] = matrix[i][j];
        return result;
    }

    boolean isIdentity()
    {
        if (n!=m)
            return false;
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                if ((matrix[i][j]!=0 && i!=j) || (matrix[i][j]!=1 && i==j))
                    return false;
        return true;
    }

    boolean isSymmetric()
    {
        if (n!=m)
            return false;
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                if (matrix[i][j] != matrix[j][i])
                    return false;
        return true;
    }

    void display()
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}