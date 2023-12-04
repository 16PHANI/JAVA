class Bike
{
    final void run()
    {
        System.out.println("Running");
    }
}
class final_Keyword extends Bike
{
    /*
    void run()//Error
    {
        System.out.println("Honda Bike is Running");
    }*/
    public static void main(String[] args)
    {
        final_Keyword obj=new final_Keyword();
        obj.run();
    }
}
