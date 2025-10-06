public class stringMethods 
{
    public static void main(String[] args) 
    {
        String s = " Hello, World! ";
        System.out.println("toLowerCase(): " + s.toLowerCase());
        System.out.println("toUpperCase: " + s.toUpperCase());
        System.out.println("trim(): " + s.trim());
        System.out.println("replace(c1,c2): " + s.replace('l', 'u'));
        System.out.println("equals(s2): " + s.equals("Hello"));
        System.out.println("concat(s1): " + s.concat("123"));
        System.out.println("length(): " + s.length());
        System.out.println("charAt(i): " + s.charAt(2));
        System.out.println("substring(i,j): " + s.substring(2, 5));
        System.out.println("imdexOf(c): " + s.indexOf('l'));
        
    }   
}
