import java.util.*;
public class owl
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'v' || ch == 'V')
        System.out.println("Violet");
        else if(ch == 'i' || ch == 'I')
        System.out.println("Indigo");
        else if(ch == 'b' || ch == 'B')
        System.out.println("Blue");
        else if(ch == 'g' || ch == 'G')
        System.out.println("Green");
        else if(ch == 'y' || ch == 'Y')
        System.out.println("Yellow");
        else if(ch == 'o' || ch == 'O')
        System.out.println("Orange");
        else if(ch == 'r' || ch == 'R')
        System.out.println("Red");
        else
        System.out.println("-1");
    }
}