import java.util.Scanner;
public class Operators 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println("Enter\n+ - Addition\n(-) - Subtraction\n* - Multiplication\n/ - Division\n% - Modulus");
        int choice = input.next().charAt(0);
        if (choice == '+') 
        {
            System.out.print(a + " + " + b +  " = " + (a+b));
        }
        else if (choice == '-') 
        {
            System.out.print(a + " - " + b + " = " + (a-b));
        }
        else if (choice == '*') 
        {
            System.out.print(a + " x " + b + " = " + (a*b));
        }
        else if (choice =='/') 
        {
            if(b == 0)
            {
                System.out.print("Division by zero not possible");
            }
            else
            {
                System.out.print(a + " / " + b + " = " + ((float)a/b));
            }
        }
        else if(choice == '%')
        {
            if(b == 0)
            {
                System.out.print("Modulus by zero not possible");
            }
            else
            {
                System.out.print(a+ " % " + b + " = " + (a%b));
            }
        }
        else
        {
            System.out.print("Error: Invalid number");
        }
        input.close();
    }
}
