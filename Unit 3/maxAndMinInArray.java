import java.util.Scanner;
public class maxAndMinInArray 
{
    static void raedArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static int max(int arr[])
    {
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++) if(arr[i] > max) max = arr[i];
        return max;
    }

    static int min(int arr[])
    {
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++) if(arr[i] < min) min = arr[i];
        return min;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        raedArray(arr);
        int maxNumber = max(arr);
        int minNumber = min(arr);
        System.out.println("Maximum nunber: "+maxNumber);
        System.out.println("Minimum number: "+minNumber); 
        sc.close(); 
    }
}
