import java.util.*;
public class owl
{
    public static void main(String argvs[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i >= 1 ; i--)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}