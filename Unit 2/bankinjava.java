import java.util.Scanner;

class BankAccount
{
    private String name = "Anil Kumar";
    private long account_balance = 5000;

    void deposit(long amount)
    {
        if(amount>0) 
        {
            account_balance += amount;
            System.out.println("Deposited: "+ amount);
            System.out.println("Current account balance: "+account_balance);
        }
        else System.out.println("Enter correct amount");
    }

    void withdraw(long amount)
    {
        if(amount <= account_balance)
        {
            account_balance -= amount;
            System.out.println("Withdrawed: "+amount);
            System.out.println("Current account balance: " + account_balance);
        }
        else System.out.println("Enter correct amount.");
    }

    void details()
    {
        System.out.println("Account holder's name: "+name);
        System.out.println("Account balance: " + account_balance);
    }
}

class Banker
{
    BankAccount b1 = new BankAccount();
    void start()
    {
        b1.details();
        long amount;
        System.out.println("1 - Deposit amount\n2 - Withdraw amount\n3 - Check account details");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1: 
                System.out.print("Enter deposit amount: ");
                amount = sc.nextLong();
                b1.deposit(amount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                amount = sc.nextLong(); 
                b1.withdraw(amount);
                break;
            case 3: 
                b1.details();
                break;
            default: 
                System.out.println("Enter a valid choice.");
                break;
        }
        sc.close();
    }
}


public class bankinjava 
{
    public static void main(String[] args) 
    {
        Banker bank = new Banker();
        bank.start();
    }
}
