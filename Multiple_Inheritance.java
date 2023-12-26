interface Father
{
    int Age = 48;
    void msg();
}
interface Mother
{
    int Age = 45;
    void msg1();
}
class Multiple_Inheritance implements Father, Mother
{
    public void msg()
    {
        System.out.println("Father's Age is = " + Father.Age);
    }
    public void msg1()
    {
        System.out.println("Mother's Age is = " + Mother.Age);
    }
    public static void main(String[] args)
    {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.msg();
        obj.msg1();
    }
}
