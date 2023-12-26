class Grandparent
{
    void msgGrandparent()
    {
        System.out.println("This is the Grandparent class");
    }
}
class Parent extends Grandparent
{
    void msgParent()
    {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent
{
    void msgChild()
    {
        System.out.println("This is the Child class");
    }
}

public class Multilevel_Inheritance
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.msgGrandparent();
        obj.msgParent();
        obj.msgChild();
    }
}
