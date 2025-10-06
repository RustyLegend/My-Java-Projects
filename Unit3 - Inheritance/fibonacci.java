class fibonacciGen 
{
    int noOfTerms;
    int n1 , n2;
    fibonacciGen(int noOfTerms)
    {
        this.noOfTerms = noOfTerms;
        this.n1 = 0;
        this.n2 = 1;
    }

    void printFibonacci()
    {
        System.out.println(n1);
        System.out.println(n2);
        for(int i = 0 ; i < noOfTerms-2 ; i++)
        {
            int j = n1 + n2;
            System.out.println(j);
            n1 = n2;
            n2 = j;
        }
    }
}

public class fibonacci 
{
    public static void main(String[] args) 
    {
        fibonacciGen f = new fibonacciGen(10);
        f.printFibonacci();
    }
}
