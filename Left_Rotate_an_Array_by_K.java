import java.util.*;
public class owl
{
    public static void main(String arggs[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            if(i >= k && k < n)
            System.out.print(arr[i]+" ");
            if(k > n )
            System.out.print(arr[i]+" ");
        }
        for(int i = 0 ; i < k ; i++)
        {
            if(k <= n)
            System.out.print(arr[i]+" ");
        }
    }
}