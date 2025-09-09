class Compare
{
    Compare(int a , int b)
    {
        if(a>b) System.out.println(a + " is greater.");
        else System.out.println(b + " is greater.");
    }
    Compare(char a , char b)
    {
        if(a>b) System.out.println(a + " is greater.");
        else System.out.println(b + " is greater.");
    }
    Compare(String a , String b)
    {
        if(a.length() > b.length()) System.out.println(a);
        else System.out.println(b);
    }
}

public class theGreatDebate
{
    public static void main(String[] args) 
    {
        new Compare(85,90);
        new Compare('A','C');
        new Compare("Think Big", "Dream Bigger");
    }
}
