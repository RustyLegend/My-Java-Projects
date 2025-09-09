public class varArgsExample 
{
    static int sum(int... a)
    {
        int sum = 0;
        for (int i : a) sum += i;
        return sum;
    }

    public static void main(String[] args)
    {
        int result = sum(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum: " + result);
    }
}
