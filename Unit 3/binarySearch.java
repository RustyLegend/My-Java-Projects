import java.util.Arrays;
import java.util.Scanner;
public class binarySearch 
{
    static void readArray(int[] a , Scanner sc)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    static void displayArray(int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        readArray(arr,sc);
        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        displayArray(arr);
        System.out.print("Enter the value you want to search: ");
        int key = sc.nextInt();
        int index = Arrays.binarySearch(arr , key);
        if(index < 0) System.out.println("Value not found");
        else System.out.println("Value is at position: " + (index+1));
        sc.close();
    }
}
