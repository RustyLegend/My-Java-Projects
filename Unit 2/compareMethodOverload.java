class comparator 
{
    void compare(int a , int b)
    {
        if (a>b) System.out.println(a + " is greater");
        else System.out.println(b + " is greater");
    }

    void compare(char a , char b)
    {
        if (a>b) System.out.println(a + " is greater");
        else System.out.println(b + " is greater");
    }

    void compare(String a , String b)
    {
        if (a.length() > b.length()) System.out.println( "'" + a + "'" + " has large charcater count");
        else System.out.println( "'" + b + "'" + " has large charcater count");
    }
}

public class compareMethodOverload 
{
    public static void main(String[] args)
    {
        comparator c = new comparator();
        c.compare(85 , 90);
        c.compare('A', 'C');
        c.compare("Think Big", "Dream Bigger");
    }
}
