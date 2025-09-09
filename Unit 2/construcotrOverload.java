class Join
{
    Join(int a , int b)
    {
        System.out.println("Sum: " + (a+b));
    }

    Join(char a , char b)
    {
        System.out.println("Joint String: " + a + b);
    }
}

public class construcotrOverload 
{
    public static void main(String[] args) 
    {
        new Join(3, 4);
        new Join('A', 'c');
    }
}
