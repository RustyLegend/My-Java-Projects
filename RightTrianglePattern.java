import java.util.Scanner;
public class RightTrianglePattern 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        for (int i=1;i<=rows;i++)
        {
            for (int j = 0 ; j<i ; j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
