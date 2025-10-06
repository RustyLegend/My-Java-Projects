public class replaceVowelsWith 
{
    public static void main(String[] args) 
    {
        String s = "Hello, World";
        StringBuffer sb = new StringBuffer(s);
        for(int i = 0 ; i < s.length() ; i++)
        {
            char c = sb.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                sb.setCharAt(i, '$');
            }
        }
        String modified = sb.toString();
        System.out.println(modified);
    }
}
