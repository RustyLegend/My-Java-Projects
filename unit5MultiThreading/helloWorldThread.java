package unit5MultiThreading;

public class helloWorldThread implements Runnable
{
    public void run()
    {
        System.out.println("Hello, World");
    }

    public static void main(String[] args) 
    {
        helloWorldThread h = new helloWorldThread();
        Thread t = new Thread(h);
        t.start();
    }
}