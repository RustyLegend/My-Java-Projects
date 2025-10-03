import java.util.Scanner;
public class readingPrintingArray 
{
    static void read(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    
    static void print(int arr[])
    {
        System.out.print("Array elements are: ");
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        read(arr);
        print(arr);
        sc.close();
    }
}