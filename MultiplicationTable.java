import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i = 1; i<=rows; i++)
        {
            System.out.println(number + " x " + i + " = " + (number*i));
        }
        input.close();
    }
}