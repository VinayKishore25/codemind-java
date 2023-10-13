import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String n = "aeiouAEIOU";
        char ch = sc.next().charAt(0);
        if(n.contains(ch+""))
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
    }
}