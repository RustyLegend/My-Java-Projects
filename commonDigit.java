import java.util.Scanner;

public class commonDigit 
{
    public static void main(String[] args) 
    {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 (between 25 and 75) : ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 (between 25 and 75) : ");
        int b = sc.nextInt();
        sc.close();
        if(a<=25 || a>=75 || b<=25 || b>=75) 
        {
            System.out.println("Invalid range.");
            return;
        }
        for(int i = a ; i > 0 ; i /= 10)
        {
            int i1 = i%10;
            for(int j = b ; j > 0 ; j /= 10)
            {
                int j1 = j%10;
                if (i1 == j1) check = true;
            }
        }
        if(check) System.out.println("It has a common digit");
        else System.out.println("It does NOT have a common digit");
    }
}
