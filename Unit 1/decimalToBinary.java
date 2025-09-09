import java.util.Scanner;

class dToB
{
     int ct = 0;
     int decimalNumber;
     void read()
     {
          Scanner sc = new Scanner(System.in);
          System.err.print("Enter a decimal number: ");
          decimalNumber = sc.nextInt();
          sc.close();
     }

     int convert()
     {
          int binaryNumber = 0;
          while (decimalNumber > 0)
          {
            int remainder = decimalNumber%2;
            binaryNumber = 10*binaryNumber + remainder;
            decimalNumber = decimalNumber/2;
            ct++;
          }
          return binaryNumber;
     }

     int reverser()
     {
          int binaryNumber = convert();
          int revrse = 0;
          for(int i = 0 ; i<ct ; i++)
          {
            int remainder = binaryNumber%10;
            revrse = 10*revrse + remainder;
            binaryNumber = binaryNumber/10;
          }
          return revrse;
     }

     void display() {System.out.println("Binary equivalent number is: " + reverser());}
}

public class decimalToBinary 
{
    public static void main(String args[])
    {
       dToB c1 = new dToB();
       c1.read();
       c1.display();
    }  
}