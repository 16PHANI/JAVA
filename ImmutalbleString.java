class ImmutableString 
{
    public static void main(String[] args) 
    {
        String department = "CSE ";
        String section = "A ";
        System.out.println("Department = " + department);
        System.out.println("Section = " + section);
        department = department.concat("Branch ");
        section = section.concat("Section ");
        System.out.println("After concatenating, Department = " + department);
        System.out.println("After concatenating, Section = " + section);
    }
}
