import java.util.Scanner;
public class deleteDuplicatesInArray 
{

    static void readArray(int a[] , Scanner sc)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            System.out.print("Enter number " + (i+1) + ": ");
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int arr[] = new int[5];
        readArray(arr, sc);
        for(int i = 0 ; i < 5 ; i++)
        {
            for(int j = i+1 ; j < 5 ; j++)
            {
                if(arr[i] == arr[j]) arr[j] = 0;
            }
        }
        System.out.println("Array after deleting duplicates: ");
        for(int i = 0 ; i < 5 ; i++) System.out.print(arr[i] + " ");
    }
}
