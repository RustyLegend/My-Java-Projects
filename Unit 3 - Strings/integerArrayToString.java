public class integerArrayToString 
{
    public static void main(String[] args) 
    {
        StringBuffer s = new StringBuffer();
        int arr[] = {1,2,3,4,5};
        for(int i = 0 ; i < arr.length ; i++)
        {
            s.append(arr[i]);
        }
        System.out.println(s);
    }
}
