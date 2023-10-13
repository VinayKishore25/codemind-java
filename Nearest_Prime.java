import java.util.Scanner;
public class Nearest{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++){
            int n = sc.nextInt();
            int next = n + 1, pre = n - 1;
            
            if(isPrime(n)){
                System.out.println(n);
            }
            else{
                while(!isPrime(next)){
                    next++;
                }
                while(!isPrime(pre)){
                    pre--;
                }
                
                if(next - n < n - pre){
                    System.out.println(next);
                }
                else{
                    System.out.println(pre);
                }
            }
        }
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        else if(n == 2){
            return true;
        }
        for(int i = 2; i < Math.sqrt(n) + 1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}