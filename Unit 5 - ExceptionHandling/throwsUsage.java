public class throwsUsage 
{
    static int check(int m , int n) throws ArithmeticException
    {
        int result = m/n;
        return result;
    }

    public static void main(String[] args) 
    {
        try
        {
            System.out.println(throwsUsage.check(5, 0));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
