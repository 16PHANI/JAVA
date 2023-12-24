class Mtd
{
    int x,y,z;
    int sum(int x,int y)
    {
        return x+y;
    }
    int sum(int x,int y,int z)
    {
        return x+y+z;
    }
}
class MethodOverloading
{
    public static void main(String[] args)
    {
        Mtd obj=new Mtd();
        int a=obj.sum(10,20);
        System.out.println(a);
        int b=obj.sum(10,20,30);
        System.out.println(b);
    }
}
