interface Shaped
{
    void getArea();
}

class rectangled implements Shaped
{
    int l = 3 , b = 2;
    public void getArea()
    {
        System.out.println("The area of rectangle is: " + (l*b));
    }
}

class circled implements Shaped
{
    int r = 10;
    public void getArea()
    {
        System.out.println("The are of the circle is: " + (3.14*r*r));
    }
}

class triangled implements Shaped
{
    int b = 2 , h = 10;
    public void getArea()
    {
        System.out.println("The area of the triangle is: " + (0.5*b*h));
    }
}

public class shapeIntergace 
{
    public static void main(String[] args) 
    {
        rectangled r = new rectangled();
        circled c = new circled();
        triangled t = new triangled();
        r.getArea();
        c.getArea();
        t.getArea();
    }
}
