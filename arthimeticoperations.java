import java.util.Scanner;

public class arthimeticoperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char c = 'Y';
        while(c == 'Y' || c == 'y')
        {
            System.out.print("Enter number 1: ");
            float a = sc.nextFloat();
            System.out.print("Enter number 2: ");
            float b = sc.nextFloat();
            System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n5- Modulo");
            int ch = sc.nextInt();
            if(ch == 1) System.out.println(a + " + " + b +" = " +(a+b));
            else if(ch == 2) System.out.println(a + " - " + b + " = " + (a-b));
            else if(ch == 3)System.out.println(a + " x " + b + " = " + (a*b));
            else if(ch == 4)
            {
                if(b == 0) System.out.println("Division not possible.");
                else System.out.println(a + " / " + b + " = " + (a/b));
            }
            else if(ch == 5)
            {
                if(b == 0) System.out.println("Modulo not possible.");
                else System.out.println(a + " % " + b + " = " + (a%b));
            }
            else System.out.println("Enter a correct number.");
            System.out.print("Do you want to continue {y/n} : ");
            c = sc.next().charAt(0);
        }
        sc.close();
    }
}
