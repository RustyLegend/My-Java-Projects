import java.util.Scanner;
public class LeapYearOrNot 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        if (year%4 == 0) 
        {
            System.out.println("It is a leap year");    
        }
        else
        {
            System.out.println("It is NOT a leap year");
        }
    }
}
