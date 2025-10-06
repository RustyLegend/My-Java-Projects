public class stringToArray 
{
    public static void main(String[] args) 
    {
        String s = "Hello";
        char arr[] = s.toCharArray();
        for(char c: arr)
        {
            System.out.println(c);
        }
    }    
}
