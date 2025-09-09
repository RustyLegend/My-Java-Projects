import java.util.Scanner;
public class arthimeticoperations 
{
    static void add(float a , float b)
    {
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    static void subtract(float a , float b)
    {
        System.out.println(a + " - " + b + " = " + (a-b));
    }

    static void multiply(float a , float b)
    {
        System.out.println(a + " * " + b + " = " + (a*b));
    }

    static void divide(float a , float b)
    {
        if(b==0) System.out.println("Division by zero error.");
        else System.out.println(a + " / " + b + " = " + (a/b));
    }

    static void modulo(float a , float b)
    {
        if(b==0) System.out.println("Modulo by zero error.");
        else System.out.println(a + " % " + b + " = " + (a%b));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st operand: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd operand: ");
        float b = sc.nextFloat();
        System.out.println(" + , - , * , / , % ?");
        char operator = sc.next().charAt(0);
        if (operator == '+') add(a, b);
        else if (operator == '-') subtract(a, b);
        else if (operator == '*') multiply(a, b);
        else if (operator == '/') divide(a, b);
        else if (operator == '%') modulo(a, b);
        else System.out.println("Incorrect operator.");
        sc.close();
    }
}