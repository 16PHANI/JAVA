class Outer
{
    int a = 5;
    void dispOuter()
    {
        System.out.println("Outer Class = " + a);
    }
    interface Inner
    {
        int b = 10;
        void dispInner();
    }
}
class Interface_In_Class implements Outer.Inner
{
    public void dispInner() {
        System.out.println("Inner Class = " + b);
    }
    public static void main(String[] args)
    {
        Interface_In_Class obj = new Interface_In_Class();
        obj.dispInner();
        Outer s=new Outer();
        s.dispOuter(); // Inner Class
    }
}
