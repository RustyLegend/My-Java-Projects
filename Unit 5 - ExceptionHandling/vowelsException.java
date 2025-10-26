class vowels extends Exception
{
    vowels(){super();}
    vowels(String e){super(e);}
}

public class vowelsException 
{
    public static void main(String[] args) 
    {
        String s2 = "BCD";
        try
        {
            if(!(s2.toLowerCase().contains("a") || s2.toLowerCase().contains("e") || s2.toLowerCase().contains("i") || s2.toLowerCase().contains("o") || s2.toLowerCase().contains("u")))
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
