import java.util.Scanner;

public class factorial 
{
    int facotialOfNumber(int n )
    {
        int fact = 1;
        while (n>1) 
        {
            fact = fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        if(number < 0)
        {
            System.out.println("Invalid number.");
            return;
        }
        factorial f = new factorial();
        int fact = f.facotialOfNumber(number);
        System.out.println("The factorial of " + number + " is " + fact);
    }
}
