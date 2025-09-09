class Joiner
{
    int a;
    int b;
    Joiner(int a , int b)
    {
        this.a = a;
        this.b = b;
        System.out.println("Sum is: " + (this.a + this.b));
    }
}

public class thisFinalFinalize 
{
    public static void main(String[] args) 
    {
        new Joiner(3, 4);
        final double PI = 3.1415926535;
        System.out.println("Value of PI is: "+PI);
    }
}
