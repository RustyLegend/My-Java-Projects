abstract class telephone 
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartTelephone extends telephone 
{
    void ring() {System.out.println("Phone ringing.");}
    void lift() {System.out.println("Call lifted.");}
    void disconnect() {System.out.println("Call disconnected.");}
}

public class telephoneExample 
{
    public static void main(String[] args) 
    {
        smartTelephone obj = new smartTelephone();
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
