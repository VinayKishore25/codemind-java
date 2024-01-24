import java.util.*;
public class bcd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        if(n < 0)
        {
            count = -1;
            n = n*-1;
        }
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int x = Integer.parseInt(sb.toString());
        System.out.println(x*count);
    }
}