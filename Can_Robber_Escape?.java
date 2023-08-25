import java.util.Scanner;
public class maij
{
    public static void main(String aegd[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr= new int[a];
        for (int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int x:arr)
        {
            if(x>=a)
            {
                c++;
            }
        }
        if(c>=1)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}