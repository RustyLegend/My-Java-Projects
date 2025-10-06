import java.lang.Math;
class Point
{
    double x = 0;
    double y = 0;
    Point(double x , double y)
    {
        this.x = x;
        this.y = y;
    }
}

public class distanceBetweenTwoPoints 
{
    static double distance(Point p1 , Point p2)
    {
        double distance = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
        return distance;
    }

    public static void main(String[] args) 
    {
        Point p1 = new Point(3, 2);
        Point p2 = new Point(1, 1);
        double distance = distance(p1, p2);
        System.out.println("Distance between given points is: " + distance);
    }
}
