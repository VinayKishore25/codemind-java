import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int x = sc.nextInt();
        int i=1;
        while(true)
        {
            if(n1>n2)
            {
                System.out.println("-1");
                break;
            }
            else
            {
                if(n2*i>((n1*i)+x))
                {
                    System.out.println(i);
                    break;
                }
                else
                {
                    i++;
                }
            }
        }
        
    }
}