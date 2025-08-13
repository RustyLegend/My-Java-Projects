import java.util.Scanner;
class bookdetails
{
    String book_name;
    long book_ID;
    int price;
    bookdetails(String book_name , long book_ID , int price)
    {
        this.book_name = book_name;
        this.book_ID = book_ID;
        this.price = price;
    }
    void display() {System.out.println("Book name: "+book_name+"\nBook ID: "+book_ID+"\nBook price: "+price);}
}


public class book2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        String book_name = sc.nextLine();
        System.out.print("Enter book ID: ");
        long book_ID = sc.nextLong();
        System.out.print("Enter book price: ");
        int price = sc.nextInt();
        sc.close();
        bookdetails b0 = new bookdetails(book_name, book_ID, price);
        b0.display();
    }
}
