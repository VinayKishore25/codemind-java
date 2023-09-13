import java.util.Scanner;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String name = sc.nextLine();
        double u = sc.nextInt();
        double bill;
        if(u<400)
        {
            bill=100;
            if(u<199)
            {
                bill += u*1.20;
            }
            else if(u>199 && u<400)
            {
                bill += u*1.50;
            }
        }
        else
        {
            if(u>=400 && u<600)
            {
                bill = u*1.80;
                bill = bill + bill*0.15;
            }
            else
            {
                bill = u*2.00;
                bill = bill + bill*0.15;
            }
        }
        System.out.printf("%.2f",bill);
    }
}