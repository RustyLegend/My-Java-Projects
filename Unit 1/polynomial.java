import java.util.Scanner;
import java.lang.Math;
public class polynomial 
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a , b , c for ax^2 + bx + c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        float delta = (b*b) - (4*a*c);
        if(delta>0)
        {
            float x1 = (-b + (float)Math.sqrt(delta)) / (2*a);
            float x2 = (-b - (float)Math.sqrt(delta)) / (2*a);
            System.out.println(x1 + " , " + x2 + " are the roots");
        }
        else if(delta == 0)
        {
            float x1 = -b / (2*a);
            float x2 = x1;
            System.out.println(x1 + " , " + x2 + " are the roots");
        }
        else
        {
            System.out.println("Imaginary roots");
        }
        input.close();
    }
}
