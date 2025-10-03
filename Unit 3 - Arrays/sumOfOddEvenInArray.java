import java.util.Scanner;
public class sumOfOddEvenInArray 
{
    static void read(int arr[])
    {
        Scanner sc  = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int evenSum = 0;
        int oddSum = 0;
        read(arr);
        for (int i : arr) 
        {
            if(i%2==0) evenSum += i;
            else oddSum += i;
        }
        System.out.println("Even elements sum is: " + evenSum);
        System.out.println("Odd elements sum is: " + oddSum);
        sc.close();
    }
}
