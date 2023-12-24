interface A
{
    int a=4;
    void dispA();
    interface B
    {
        int b=5;
        void dispB();
    }
}
class Interface_In_Interface implements A.B
{

    public void dispA()
    {
        System.out.println("Outer Inference");
    }
    public void dispB()
    {
        System.out.println("Innter Interfene");
    }
    public static void main(String[] args)
    {
        Interface_In_Interface obj=new Interface_In_Interface();
        obj.dispA();
        obj.dispB();
    }
}
