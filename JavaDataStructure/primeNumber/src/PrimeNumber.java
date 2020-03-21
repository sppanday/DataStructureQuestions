public class  PrimeNumber{

    public static void main(String[] args)
    {
        int a = 1;
        int primes = 0;

        while (primes <10001)
        {
            if (isPrime(a) == true)
            {
                primes++;
                
            }
            
       System.out.println("The 10001st prime number is " + a);  
             a++;
  
        }

        
    }

    public static boolean isPrime(int b)
    {
        boolean x = false;
        int counter = 0;
    
        for (int i=1; i<=b; i++)
        {
            if (b%i == 0)
            {
                counter++;
            }

            if (counter == 2 && i==b)
            {
                x = true;
            }
        }

        return x;
    }
}