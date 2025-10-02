import java.util.Scanner;
public class matrixAddition 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number rows for matrix 1: ");
        int rows1 = sc.nextInt();
        System.out.print("Enter number of columns for column 1: ");
        int columns1 = sc.nextInt();
        System.out.print("Enter number rows for matrix 2: ");
        int rows2 = sc.nextInt();
        System.out.print("Enter number of columns for column 2: ");
        int columns2 = sc.nextInt();

        if(rows1 != rows2 || columns1 != columns2)
        {
            System.out.println("Addition not possible on the matrix.");
        }
        else 
        {
            int matrix1[][] = new int[rows1][columns1];
            int matrix2[][] = new int[rows2][columns2];

            System.out.println("---------1st Matrix---------");
            for(int i = 0 ; i < matrix1.length ; i++)
            {
                for(int j = 0 ; j < matrix1[i].length ; j++)
                {
                    System.out.print("Enter value for row " + (i+1) + " and column " + (j+1) + ": ");
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("---------2nd Matrix---------");
            for(int i = 0 ; i < matrix2.length ; i++)
            {
                for(int j = 0 ; j < matrix2[i].length ; j++)
                {
                    System.out.print("Enter value for row " + (i+1) + " and column " + (j+1) + ": ");
                    matrix2[i][j] = sc.nextInt();
                }
            }

            int result[][] = new int[rows1][columns1];
            for(int i = 0 ; i < rows1 ; i++)
            {
                for(int j = 0 ; j < columns1 ; j++)
                {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println();
            System.out.println("Resultant matrix: ");
            for(int i = 0 ; i < rows1 ; i++)
            {
                for(int j = 0 ; j < columns1 ; j++)
                {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
