//Addition of two numbers using an instance method with a return statement.
class MyClass 
{
    int add(int x, int y) 
    {
        int sum = x + y;
        return sum;
    }
}

public class Instance_Method2
{
    public static void main(String[] args) 
    {
        MyClass obj = new MyClass();
        int result = obj.add(1, 2);
        System.out.println("Sum of two numbers = " + result);
    }
}
