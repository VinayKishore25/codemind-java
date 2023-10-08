import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            double x1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double y2 = sc.nextDouble();
            if(y1/x1 == y2/x2)
            System.out.println("0");
            else if(y1/x1 > y2/x2)
            System.out.println("1");
            else
            System.out.println("-1");
            t--;
        }
    }
}