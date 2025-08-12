public class javaInstalledOrNot 
{
    public static void main(String[] args) 
    {
        String version = System.getProperty("java.version");
        if(version != null)
        {
            String vendor = System.getProperty("java.vendor");
            String vendorURL = System.getProperty("java.vendor.url");
            String runtimeVersion = System.getProperty("java.runtime.version");
            String home = System.getProperty("java.home");
            String classPath = System.getProperty("java.class.path");
            System.out.println("Java version: " + version);
            System.out.println("Java Runtime Version: " + runtimeVersion);
            System.out.println("Java Home: " + home);
            System.out.println("Java vendor: " + vendor);
            System.out.println("Java vendor URL: " + vendorURL);
            System.out.println("Java class path: " + classPath);
        }
        else System.out.println("Java is not installed.");
    }
}