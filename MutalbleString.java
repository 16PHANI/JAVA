class MutalbleString
{
    public static void main(String[] args)
    {
        StringBuffer obj1=new StringBuffer("CSE ");
        StringBuilder obj2=new StringBuilder("A ");
        System.out.println("String 1 = "+obj1);
        System.out.println("String 2 = "+obj2);
        obj1=obj1.append("Branch ");
        obj2=obj2.append("Section ");
        System.out.println("After append String 1 = "+obj1);
        System.out.println("After append String 2 = "+obj2);
    }
}
