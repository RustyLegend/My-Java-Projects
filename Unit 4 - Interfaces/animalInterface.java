interface animal 
{
    void bark();
}

class dog implements animal
{
    public void bark()
    {
        System.out.println("Dog is barking.");
    }
}

public class animalInterface 
{
    public static void main(String[] args) 
    {
        dog d = new dog();
        d.bark();
    }
}
