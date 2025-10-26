package unit4Packages;
import unit4Packages.operationsPack.*;
public class operations implements addSubtract
{
    public void add(float a , float b) {System.out.println(a+b);}
    public void subtract(float a , float b) {System.out.println(a-b);}

    public static void main(String[] args) 
    {
        operations o = new operations();
        o.add(1, 2);
        o.subtract(10, 9);
        multiplyDivide m = new multiplyDivide();
        m.multiply(2,3);
        m.divide(2, 3);
    }
}
