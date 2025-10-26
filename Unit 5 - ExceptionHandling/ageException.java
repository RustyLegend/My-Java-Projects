public class ageException 
{
    static void checkEligibility(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access Denied");
        }
        else
        {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) 
    {
        ageException.checkEligibility(20);
        ageException.checkEligibility(13);
    }
}
