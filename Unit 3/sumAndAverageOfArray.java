import java.util.Scanner;

public class sumAndAverageOfArray 
{
    static void readArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter number "+(i+1) + ": ");
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
        readArray(arr);
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++) sum += arr[i];
        float average = (float)sum/arr.length;
        System.out.println("Sum of elements in the array: "+sum);
        System.out.println("Average of elements: "+average);
        sc.close();
    }
}