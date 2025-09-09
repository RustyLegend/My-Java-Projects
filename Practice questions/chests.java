import java.util.Scanner;
public class chests 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] IDs = sc.nextLine().split(" ");
        sc.close();
        int value = 0;
        for(int i = 0 ; i < IDs.length ; i++)
        {
            if(Integer.parseInt(IDs[i]) == -1)
            {
                System.out.println("Trap encountered at chest ID " + (i+1));
                break;
            } 
            else if (Integer.parseInt(IDs[i]) % 2 == 0) continue;
            else value += Integer.parseInt(IDs[i]);
        }
        System.out.println("Total treasure collected: " + value);
    }
}
