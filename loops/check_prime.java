package loops;
import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        boolean isprime=true;
        if(num==2){
            System.out.println("The number is prime");
        }else{

        

        for(int i=2 ; i<Math.sqrt(num);i++){
            if(num%i==0){
                isprime=false;
            }
        }
        if(isprime==true){
            System.out.println("The number is not prime");
        }else{
            System.out.println("the number is prime");
        }
    }

  
    }
}
