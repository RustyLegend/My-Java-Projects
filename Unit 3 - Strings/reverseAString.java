public class reverseAString 
{
    public static void main(String[] args) 
    {
        String s = "Hello, World!";
        StringBuffer sb = new StringBuffer(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
}
