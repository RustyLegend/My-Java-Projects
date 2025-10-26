class shape 
{
    void printShape() {System.out.println("This is a shape.");}
}

class rectangle extends shape
{
    void printRectangle() {System.out.println("This is a rectangular shape.");}
}

class circle extends shape
{
    void printCircle() {System.out.println("This is a circular shape.");}
}

class square extends rectangle
{
    void printSquare() {System.out.println("Square is a rectangle.");}
}

public class shape2 
{
    public static void main(String[] args) 
    {
        square s = new square();
        s.printShape();
        s.printRectangle();
    }
}
