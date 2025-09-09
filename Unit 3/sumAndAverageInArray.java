import java.util.Scanner;

public class sumAndAverageInArray 
{
    static void read(int arr[])
    {
        Scanner sc = new Scanner(System.in);
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
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        read(arr);
        int sum = 0;
        for(int i : arr) sum += i;
        System.out.println("Sum of elements in the array: " + sum);
        System.out.println("Average of the elements in the array: " + (float)sum/arr.length);
        sc.close();
    }
}
