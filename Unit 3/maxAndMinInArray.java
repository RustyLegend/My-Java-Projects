import java.util.Scanner;

public class maxAndMinInArray 
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

    static int maximum(int arr[] , int size)
    {
        int max = arr[0];
        for(int i = 1 ; i < size ; i++) if (arr[i] > max) max = arr[i];
        return max;
    }

    static int minimum(int arr[],int size)
    {
        int min = arr[0];
        for(int i = 0 ; i < size ; i++) if(arr[i] < min) min = arr[i];
        return min;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int M = sc.nextInt();
        int arr[] = new int[M];
        read(arr);
        int max = maximum(arr, M);
        int min = minimum(arr, M);
        System.out.println("Maximum element of the array is: "+max);
        System.out.println("Minimum element of the array is: "+min);
        sc.close();
    }
}
