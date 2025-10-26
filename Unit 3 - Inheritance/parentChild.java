class parent 
{
    void printParent() {System.out.println("This is parent class.");}
}

class child extends parent 
{
    void printChild() {System.out.println("This is child class.");}
}

public class parentChild 
{
    public static void main(String[] args) 
    {
        parent p = new parent();
        child c = new child();
        p.printParent();
        c.printChild();
        c.printParent();
    }
}
