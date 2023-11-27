interface Area_Interface
{
    float PI=3.14f;
    void Square();
    void Circle();
}
class Area implements Area_Interface
{
    public void Square()
    {
        int s=10;
        System.out.println("Area of Square : "+(s*s));
    }
    public void Circle()
    {
        int r=10;
        System.out.println("Area of Circle : "+(PI*r*r));
    }
    public static void main(String[] args)
    {
        Area obj=new Area();
        obj.Square();
        obj.Circle();
    }
}
