abstract class A
{
    int a=2,b=3;
    abstract int add(int c,int d);
    void display()
    {
        System.out.println("Hi");
    }
}
class B extends A
{
    int a,b;
    int add(int i ,int j)
    {
        a=i;
        b=j;
        System.out.println("Super Class Variable Sum = "+(super.a+super.b));
        return a+b;
    }
    void disp()
    {
        System.out.println("Non-abstract method Implementation = "+(a+b));
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        B b=new B();
        b.display();
        b.disp();
        int res=b.add(5,5);
        System.out.println(res);
    }
}
