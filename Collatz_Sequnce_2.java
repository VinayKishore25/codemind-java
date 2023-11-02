import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0 , maxCount = 0 , ans = 0 ;
        for(int i = a ; i <= b ; i++ )
        {
            int p = i;
            count = 0 ;
            while(p!=1)
            {
                if(p%2 == 0)
                {
                    p = p/2 ;
                    count++;
                }
                else
                {
                    p = 3*p + 1 ;
                    count++;
                }
            }
            if(count > maxCount )
            {
                maxCount = count;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}