import java.util.Scanner;
public class readAndPrint2DArray 
{
    static void readArray(int a[][] , Scanner sc)
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < a[i].length ; j++)
            {
                System.out.print("Enter number at row " + (i+1) + " column" + (j+1) + ": ");
                a[i][j] = sc.nextInt();
            }
        }
    }

    static void printArray(int a[][])
    {
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < a[i].length ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int matrix[][] = new int[rows][columns];
        readArray(matrix, sc);
        System.out.println("Matrix: ");
        printArray(matrix);
    }
}
