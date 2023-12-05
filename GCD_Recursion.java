import java.util.*;
class Logic
{
    int GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return GCD(b,a%b);
        }
    }
}
class GCD_Recursion
{
    public static void main(String[] args)
    {
        int n1,n2;
        System.out.println("Enter n1 and n2 : ");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        n2=obj.nextInt();
        Logic obj1=new Logic();
        System.out.println("GCD of "+n1+" and "+n2+" is : "+obj1.GCD(n1,n2));
        obj.close();
    }
}
