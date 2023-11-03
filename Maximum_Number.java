import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(arr[i]=='6')
            {
                arr[i] = '9';
                break;
            }
        }
        Arrays.toString(arr);
        System.out.println(arr);
    }
}