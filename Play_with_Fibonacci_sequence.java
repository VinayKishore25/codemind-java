import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0 , second = 1 , third =0 ;
        while( n != 0)
        {
            System.out.print(first + " ");
            third = first + second ;
            first = second ;
            second = third ;
            n--;
        }
    }
}