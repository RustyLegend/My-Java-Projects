import java.util.Scanner;
public class copyAnArray 
{
    static int[] copyArray(int arr[] , int size)
    {
        int copiedarr[] = new int[size];
        for(int i = 0 ; i < size ; i++) copiedarr[i] = arr[i];
        return copiedarr;
    }

    static void readArray(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        readArray(arr);
        int copiedArray[] = copyArray(arr, size);
        for(int i = 0 ; i < copiedArray.length ; i++) System.out.print(copiedArray[i] + " ");
        sc.close();
    }
}
