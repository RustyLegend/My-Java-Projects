import java.util.Scanner;
public class FindSumAndAverage 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int sum = 0;
        for(int i = 0 ; i < 5 ; i++)
        {
            int a = input.nextInt();
            sum += a;
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Average is: " + (float)sum/5);
    }    
}
