package unit4Packages.Quad2;
import unit4Packages.Quad1.quadraticRootsInterface;
public class rootsOfEq implements quadraticRootsInterface
{
    public void printRoots(float a , float b ,float c)
    {
        float delta = b*b-4*a*c;
        float x1 = (-b + (float)Math.sqrt(delta)) / (2*a);
        float x2 = (-b - (float)Math.sqrt(delta)) / (2*a);
        System.out.println("Roots are: " + x1 + " " + x2);
    }

    public static void main(String[] args) 
    {
        rootsOfEq r = new rootsOfEq();
        r.printRoots(1, 2, 1);
    }
}
