import java.util.Scanner;

public class vowelOrConsonant 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') System.out.println("It is a vowel");
        else if ( !(ch >= 'a' && ch <= 'z') ) System.out.println("Error.");
        else System.out.println("It is a consonant");
    }
}
