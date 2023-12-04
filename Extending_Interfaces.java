interface MyInterface1
{
    String a="CSE";
    void disp1();
}
interface MyInterface2 extends MyInterface1
{
    String b="A";
    void disp2();
}
class Extending_Interfaces implements MyInterface2
{
    public void disp1()
    {
        System.out.println("Branch = "+a);
    }
    public void disp2()
    {
        System.out.println("Class = "+(a+"-"+b));
    }
    public static void main(String[] args)
    {
        Extending_Interfaces obj=new Extending_Interfaces();
        obj.disp1();
        obj.disp2();
    }
}
