import java.util.Scanner;
public class readAndPrintStrng 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }    
}
