
import java.util.*;
public class print_Nth_fibonacci {
    public static int fib(int n){
        if(n==0 || n==1){
            return 0; // current n will be returned either 1 or 0
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(fib(n));
        
    }
}
