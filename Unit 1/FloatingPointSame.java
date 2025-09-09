import java.util.Scanner;
public class FloatingPointSame 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float num1 = input.nextFloat();
        System.out.print("Enter number 2: ");
        float num2 = input.nextFloat();
        num1 = num1*1000;
        num2 = num2*1000;
        if ((int)num1 == (int)num2)
        {
            System.out.println("They are same upto 3 floating decimals");
        }
        else
        {
            System.out.println("They are NOT same upto 3 floating decimals");
        }
        input.close();
    }
}