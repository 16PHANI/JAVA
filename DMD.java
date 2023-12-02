class P
{
    int a=5;
    void display()
    {
        System.out.println("a = "+a);
    }
}
class C extends P
{
    int b=10;
    void display()
    {
        System.out.println("b = "+b);
    }
}
class DMD
{
    public static void main(String[] args)
    {
        P p1=new P();
        C c1=new C();
        P ref;
        ref=p1;
        ref.display();
        ref=c1;
        ref.display();
    }
}
