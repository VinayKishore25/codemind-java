import java.util.*;
public class owl
{
    public static boolean isPrime(int n)
    {
        if(n == 1 || n == 4)
        return false;
        if(n == 2 || n == 3 || n == 5)
        return true;
        for(int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int count = 0 ;
        for(int i = s ; i <= e ; i++)
        {
            if(isPrime(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}