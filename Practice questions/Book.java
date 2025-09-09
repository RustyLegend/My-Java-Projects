public class Book
{
    String title;
    String author;

    Book(String title , String author)
    {
        this.title = title;
        this.author = author;
    }

    Book (Book b0)
    {
        this.author = b0.author;
        this.title = b0.title;
    }

    void display()
    {
        System.out.println(title + " " + author);
    }

    public static void main(String[] args) 
    {
        Book b2 = new Book("Harry Potter" , "J.K Rowling");
        Book b3 = new Book(b2);
        b3.display();
    }
}