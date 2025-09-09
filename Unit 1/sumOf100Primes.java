public class sumOf100Primes 
{
    int num = 2;
    boolean isPrime(int n)
    {
        int sumOfFactors = 0;
        for(int i = 1 ; i <= n ; i++) if(n%i == 0) sumOfFactors += i;
        if(sumOfFactors == (n+1)) return true;
        else return false;
    }

    int primeNumberGenerator()
    {
        while (true) 
        {
            if(isPrime(num))
            {
                num++;
                break;
            }
            else num++;
        }
        return num-1;
    }

    public static void main(String[] args) 
    {
        int sum = 0;
        sumOf100Primes s = new sumOf100Primes();
        for(int i = 1 ; i <= 100 ; i++) sum += s.primeNumberGenerator();
        System.out.println("The sum of first 100 primes is: " + sum);
    }
}
