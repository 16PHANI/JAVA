import java.util.*;
class A
{
    void Swap(int a,int b)
    {
        System.out.println("Before Swapping a = "+a+" and b = "+b);
        int t=a;
        a=b;
        b=t;
        System.out.println("Before Swapping a = "+a+" and b = "+b);
    }
}
class CallByValue
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a=obj.nextInt();
        System.out.println("Enter another Number : ");
        int b=obj.nextInt();
        A obj1=new A();
        obj1.Swap(a, b);
        obj.close();
    }
}
