import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        if(a < 0)
        {
            System.out.println(a+ " is negative");
        }
        else if(a == 0)
        {
            System.out.println(a+ " is zero");
        }
        else if (a%2==0)
        {
            System.out.println(a+ " is even.");
        }
        else
        {
            System.out.println(a+" is odd.");
        }
        input.close();
    }
}
