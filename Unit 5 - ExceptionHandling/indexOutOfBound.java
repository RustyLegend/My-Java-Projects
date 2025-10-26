public class indexOutOfBound 
{
    public static void main(String[] args) 
    {
        try
        {
            int arr[] = {1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
