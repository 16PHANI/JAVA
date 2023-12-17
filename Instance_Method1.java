//Addition of two numbers using an instance method without a return statement.
class MyClass
{
    void add(int x,int y)
    {
        int c=x+y;
        System.out.println("Sum of two numbers = "+c);
    }
}
class Instance_Method1
{
    public static void main(String[] args)
    {
        MyClass obj=new MyClass();
        obj.add(1,2);
    }
}