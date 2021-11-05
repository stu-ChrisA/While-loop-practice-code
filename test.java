public class test
{
    public static void main(String args[])
    {
        System.out.println(countFactors(24));
    }
    public static int countFactors(int input)
    {
        int count = 1;
        while(count <= input)
        {
            if(input % count == 0)
            {
                count++;
            }
        }
        return count-1;

    }
    //public static int isPrime(int input2)
    //{

    //}
}