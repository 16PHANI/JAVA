class Mtd
{
    int a,b,c;
    // Default constructor
    Mtd()
    {
        a=b=c=10;
    }
    // Constructor with one parameter
    Mtd(int i)
    {
        a=b=c=i;
    }
    // Constructor with three parameters
    Mtd(int i,int j,int k)
    {
        a=i;
        b=j;
        c=k;
    }
    // Method to calculate the cube of the numbers
    int cube()
    {
        return a*b*c;
    }
}
class ConstructorOverloading
{
    public static void main(String[] args)
    {
        // Creating an object with the default constructor
        Mtd obj = new Mtd();
        int obj1 = obj.cube();
        System.out.println("Constructor with Default Parameters : "+obj1);
        // Creating an object with the constructor that takes one parameter
        Mtd obj2 = new Mtd(20);
        int obj2Cube = obj2.cube();
        System.out.println("Constructor with One Parameters : "+obj2Cube);
        // Creating an object with the constructor that takes three parameters
        Mtd obj3 = new Mtd(10, 20, 30);
        int obj3Cube = obj3.cube();
        System.out.println("Constructor with Three Parameters : "+obj3Cube);
    }
}
