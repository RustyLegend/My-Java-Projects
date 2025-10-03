import java.util.Scanner;
public class reverseAnArrayAndStoreInTheSame 
{

    static void readArray(int a[] , Scanner sc)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    static int[] reverse(int a[])
    {
        int tempArr[] = new int[a.length];
        for(int i = a.length-1 ; i >= 0 ; i--)
        {
            tempArr[(a.length-1) - i] = a[i];
        }
        return tempArr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        readArray(arr, sc);
        arr = reverse(arr);
        for(int i = 0 ; i < arr.length ; i++) System.out.print(arr[i] + " ");
    }
}
