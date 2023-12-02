class ConstMtd
{
    int s;
    ConstMtd()
    {
        s=10;
    }
    int Area()
    {
        int Area=s*s;
        return Area;
    }
}
class Default_Constructor
{
    public static void main(String[] args)
    {
        int a;
        ConstMtd obj=new ConstMtd();
        a=obj.Area();
        System.out.println("Area of Square = " +a);
    }
}
