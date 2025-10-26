class vowels extends Exception
{
    vowels(){super();}
    vowels(String e){super(e);}
}

public class vowelsException 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello";
        String s2 = "BCD";
        try
        {
            if(!(s2.contains("a") || s2.contains("e") || s2.contains("i") || s2.contains("o") || s2.contains("u")))
            {
                throw new vowels("Does not contain vowels");
            }
        }
        catch (vowels e)
        {
            System.out.println(e);
        }
    }
}
