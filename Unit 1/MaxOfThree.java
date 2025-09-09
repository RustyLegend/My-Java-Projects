import java.util.Scanner;
public class MaxOfThree
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();
        if (a>b && a>c)
        {
            System.out.println(a + " is greater");
        }
        else if(b>c)
        {
            System.out.println(b+ " is greater");
        }
        else
        {
            System.out.println(c+ " is greater");
        }
        input.close();
    }
}
