interface drawable
{
    void draw();
}

class c implements drawable
{
    public void draw() 
    {
        System.out.println("Circle is drawn");   
    }
}

class r implements drawable
{
    public void draw()
    {
        System.out.println("Rectangle is drawn");
    }
}

class t implements drawable
{
    public void draw()
    {
        System.out.println("Triangle is drawn");
    }
}

public class Q3 
{
    public static void main(String[] args) 
    {
        c c = new c();
        r r = new r();
        t t = new t();
        c.draw();
        r.draw();
        t.draw();
    }
}
