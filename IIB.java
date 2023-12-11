class Mtd
{
    int a,b,c;
    {
        a=b=c=10;
        System.out.println("IIB Block");
    }
    Mtd()
    {
        System.out.println("Constructor Block");
        a=b=c=20;
    }
    int CalArea()
    {
        int area=a*b*c;
        return area;
    }
}
class IIB
{
    public static void main(String[] args)
    {
        Mtd obj=new Mtd();
        int area = obj.CalArea();
        System.out.println("Area: " + area);

    }
}

