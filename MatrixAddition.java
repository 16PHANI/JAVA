import java.util.*;
public class MatrixAddition
{
    public static void main(String[] args)
    {

        int i,j;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no.of rows in matrix : ");
        int rows=obj.nextInt();
        System.out.println("Enter no.of columns in martix : ");
        int columns=obj.nextInt();
        int m1[][]=new int[rows][columns];
        int m2[][]=new int[rows][columns];
        int sum[][]=new int[rows][columns];
        System.out.println("Enter Elements in Matrix1 : ");
        for(i=0;i<rows;i++)
        {
            for (j=0;j<columns;j++)
            {
                m1[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter Elemets in Matrix 2 : ");
        for (i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                m2[i][j]=obj.nextInt();
            }
        }
    //Addition
    for (i=0;i<rows;i++)
    {
        for(j=0;j<columns;j++)
        {
            sum[i][j]=m1[i][j]+m2[i][j];
        }
    }
    for (i=0;i<rows;i++)
    {
        for(j=0;j<columns;j++)
        {
            System.out.println(sum[i][j]+"\t");
        }
        System.out.println();
    }
    obj.close();
}
}
