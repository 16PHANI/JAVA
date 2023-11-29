interface MyInterface
{
    int a=5;
    void dispOuter();
    public static class MyClass
    {
        int b=15;
        public void dispInner()
        {
            System.out.println("Inner = "+(MyInterface.a+b));
        }
    }
}
class Class_In_Interfaces implements MyInterface
{
    public void dispOuter()
    {
        System.out.println("Outer = "+a);
    }
    public static void  main(String[] args)
    {
        Class_In_Interfaces obj1=new Class_In_Interfaces();
        obj1.dispOuter();
        MyInterface.MyClass obj2=new MyInterface.MyClass();
        obj2.dispInner();
    }
}
