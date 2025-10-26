package unit4Packages.pack2;
import unit4Packages.pack1.polygon;
public class triangle implements polygon
{
    public void printArea(float a , float b)
    {
        System.out.println("Area of triangle: " + 0.5*a*b);
    }

    public static void main(String[] args) 
    {
        triangle t = new triangle();
        t.printArea(1, 2);
    }
}
