import java.util.Scanner;
import java.lang.Math;

class bToD
{
    int binaryNumber;
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        binaryNumber = sc.nextInt();
        sc.close();
    }

    int convertToDecimal()
    {
        int decimalNumber = 0;
        for(int i = 0 ; binaryNumber>0 ; i++)
        {
            int remainder = binaryNumber%10;
            decimalNumber = decimalNumber + remainder*(int)Math.pow(2, i);
            binaryNumber = binaryNumber/10;
        }
        return decimalNumber;
    }

    void display() {System.out.println("Decimal equivalent number is: " + convertToDecimal());}
}

public class binaryToDecimal 
{
    public static void main(String args[])
    {
        bToD c1 = new bToD();
        c1.read();
        c1.display();
    }
}
