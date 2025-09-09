import java.util.Scanner;
class Tools
{
    void SumOfDigits(int n)
    {
        int sum = 0;
        while (n>0) 
        {
            int temp = n%10;
            sum = sum+temp;
            n = n/10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

    int Reverse(int n)
    {
        int rev = 0;
        while (n>0) 
        {
            int temp = n%10;
            rev = rev*10 + temp;
            n = n/10;
        }
        return rev;
    }

    void Pallindrome(int n)
    {
        int reversedN = Reverse(n);
        if(n == reversedN) System.out.println(n + " is a pallindrome");
        else System.out.println(n + " is not a pallindorme");
    }
}

public class sumReversePallindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        Tools t = new Tools();
        System.out.println("Press ");
        System.out.println("1 - Sum of digits\n2 - Reversed number\n3 - Pallindrome or not");
        int ch = sc.nextInt();
        sc.close();
        switch (ch) 
        {
            case 1: t.SumOfDigits(number);
                break;
            case 2: System.out.println("The reversed number is: " + t.Reverse(number));
                break;
            case 3: t.Pallindrome(number);
                break;
            default : System.out.println("Enter a correct input.");
                break;
        }
    }
}
