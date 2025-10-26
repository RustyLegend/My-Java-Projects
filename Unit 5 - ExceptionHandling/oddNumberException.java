public class oddNumberException 
{
    static void check(int n)
    {
        if(n%2!=0)
        {
            throw new ArithmeticException("Odd number exception");
        } 
        else 
        {
            System.out.println("Good");
        }
    }
    
    public static void main(String[] args) 
    {
        oddNumberException.check(2);
        oddNumberException.check(3);
    }
}
