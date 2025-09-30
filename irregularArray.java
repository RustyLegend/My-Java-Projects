import java.util.Scanner;
public class irregularArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        int arr[][] = new int[rows][];
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print("Enter column " + (i+1) + " size: ");
            int size = sc.nextInt();
            arr[i] = new int[size];
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print("Enter number at row " + (i+1) + ", column " + (j+1) + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }    
}
