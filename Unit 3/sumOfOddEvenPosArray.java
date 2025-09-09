import java.util.Scanner;
public class sumOfOddEvenPosArray
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
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i%2==0) oddSum += arr[i];
            else evenSum += arr[i];
        }
        System.out.println("Even positioned elements sum is: " + evenSum);
        System.out.println("Odd positioned elements sum is: " + oddSum);
        sc.close();
    }
}
