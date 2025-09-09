import java.util.Scanner;

class account
{
    long account_balance = 0;
    void start_account(long amount)
    {
        account_balance = amount;
    }

    void deposit(long amount)
    {
        System.out.println("Deposited: " + amount);
        account_balance += amount;
        System.out.println("Current account balance: " + account_balance);
    }

    void withdraw(long amount)
    {
        System.out.println("Withdrawed: " + amount);
        account_balance -= amount;
        System.out.println("Current account balance: " + account_balance);
    }
}

public class practiceBank
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        account a = new account();
        System.out.println("Enter the amount to start your account: ");
        long amount = sc.nextLong();
        a.start_account(amount);
        System.out.println("1 - Deposit\n2 - Withdraw");
        int ch = sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter amount to deposit: ");
            amount = sc.nextLong();
            a.deposit(amount);
        }
        
        else if (ch==2)
        {
            System.out.println("Enter amount to withdraw: ");
            amount = sc.nextLong();
            a.withdraw(amount);
        }
        else System.out.println("Invalid choice.");
        sc.close();
    }    
}
