import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int mod = 1000000007;
        while(t > 0)
        {
            long n = sc.nextLong();
            int a = sc.nextInt();
            int b = sc.nextInt();
            long k = sc.nextLong();
            n = n%mod;
            k = k%mod;
            int vp = 0 , fp = 0 ;
            for(int i = 1 ;  i < n ; i++)
            {
                if(i%a == 0 && i%b!=0)
                vp++;
                else if(i%a!=0 && i % b == 0)
                fp++;
            }
            if((vp+fp) >= k)
            System.out.println("Win");
            else
            System.out.println("Lose");
            t--;
        }
    }
}