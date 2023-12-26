class ConstMtd
{
    int length,breadth,area;
    ConstMtd(int l,int b)
    {
        length=l;
        breadth=b;
        area=0;
    }
    int Area()
    {   area=length*breadth;
        return area;
    }

}
class ParameterisedConstructor
{
    public static void main(String[] args)
    {
        ConstMtd obj=new ConstMtd(10, 20);
        int area=obj.Area();
        System.out.println("Area of Rectangle = "+area);
    }
}
