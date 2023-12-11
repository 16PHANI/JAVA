interface Read
{
    void reading();
}
interface Work
{
    void working();
}
class Employee implements Read, Work
{
    String firstName, lastName;
    int age;
    public void reading()
    {
        System.out.println("Employee is reading !!");
    }
    public void working()
    {
        System.out.println("Employee is working !!");
    }
}
class HourlyEmployee extends Employee
{
    int salary = 5000, hoursWorked;
    public int computePay()
    {
        return salary * hoursWorked;
    }
}
public class HybridInterface
{
    public static void main(String[] args)
    {
        HourlyEmployee emp = new HourlyEmployee();
        emp.hoursWorked = 12;
        emp.firstName = "John";
        emp.lastName = "Smith";
        emp.age = 27;
        System.out.println(emp.computePay());
    }
}
