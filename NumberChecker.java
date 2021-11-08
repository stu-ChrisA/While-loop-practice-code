public class NumberChecker
{
    public static void main(String[] args)
    {
        System.out.println(countFactors(24));
        System.out.println();
        System.out.println(isPrime(24));
        System.out.println();
        System.out.println(countPrimes(100));
    }
    public static int countFactors(int input)
    {
        int count = 1;
        while(count <= input)
        {
            if(input % count == 0)
            {
                System.out.println(count);
            }
            count++;
        }
        return count - 1;
    }
    public static int isPrime(int input2)
    {
        int num = input2;
        boolean flag = false;
        for(int i = 2; i<= num / 2; i++)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.print("number is prime: ");
            return num;
        }
        else
        {
            System.out.print("number is not prime: ");
            return num;
        }
    }
    public static int countPrimes(int n)
    {
        int countOfPrimes = 0;
        for (int num = 2; num <= n; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true)
            {
                countOfPrimes++;
                System.out.println(num);
            }
        }
        System.out.println("There are "+ countOfPrimes + " prime numbers.");
        return n;
    }
}
