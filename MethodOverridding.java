class Animal
{
    void makesSound()
    {
        System.out.println("Generic Animal Sounds");
    }
}
class Dog extends Animal
{
    void makesSound()
    {
        System.out.println("Dog makes Sound");
    }
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}
class MethodOverridding
{
    public static void main(String[] args)
    {
        Animal obj=new Animal();
        Animal obj1=new Dog();// Using polymorphism
        obj.makesSound();
        obj1.makesSound();
    }
}
