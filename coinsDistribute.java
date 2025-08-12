import java.util.Scanner;

public class coinsDistribute 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] values = sc.nextLine().split(" ");
        sc.close();
        int [] intValues = new int[values.length];
        for(int i = 0 ; i < values.length ; i++) intValues[i] = Integer.parseInt(values[i]);
        int total = intValues[0] * intValues[1] + intValues[2] - intValues[3] / intValues[4];
        System.out.println("Coins for dasrath: " + total%3);
        int rem = (total - (total%3))/3;
        System.out.println("Coins for Father: " + rem);
        System.out.println("Coins for Mother: " + rem);
        System.out.println("Coins for Sister: " + rem);
    }    
}
