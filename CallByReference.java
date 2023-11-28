import java.util.*;
class A
{
    int a, b;
    void Swap(A obj)
    {
        int t;
        System.out.println("Before Swapping a = " + obj.a + " and b = " + obj.b);
        t = obj.a;
        obj.a = obj.b;
        obj.b = t;
        System.out.println("After Swapping a = " + obj.a + " and b = " + obj.b);
    }
}
public class CallByReference
{
    public static void main(String[] args)
    {
        A obj = new A();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        obj.a = s.nextInt();
        System.out.println("Enter the second number: ");
        obj.b = s.nextInt();
        obj.Swap(obj);
        s.close();
    }
}
