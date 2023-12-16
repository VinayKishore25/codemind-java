import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1 , b = 1 , c;
        while(--n!=0)
        {
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}