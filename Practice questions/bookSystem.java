import java.util.Scanner;
class libraryBook
{
    String book_title;
    String author;
    int no_of_copies;

    libraryBook(String book_title , String author , int no_of_copies)
    {
        this.book_title = book_title;
        this.author = author;
        this.no_of_copies = no_of_copies;
    }

    libraryBook(libraryBook b)
    {
        this.book_title = b.book_title;
        this.author = b.author;
        this.no_of_copies = b.no_of_copies;
    }

    void display()
    {
        System.out.println("Book title: "+book_title);
        System.out.println("Author: "+author);
        System.out.println("No.of copies available: "+no_of_copies);
    }
}

public class bookSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Book title: ");
        String book_title = sc.nextLine();
        System.out.print("Author: ");
        String author = sc.nextLine();
        System.out.print("No.of copies available: ");
        int no_of_copies = sc.nextInt();
        libraryBook b1 = new libraryBook(book_title,author,no_of_copies);
        libraryBook b2 = new libraryBook(b1);
        System.out.println();
        b1.display();
        System.out.println();
        b2.display();
        sc.close();
    }
}