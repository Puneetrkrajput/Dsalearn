package loops;
public class binomial_coeff {
    
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int bin_Coeff(int n, int r){
        int f_n=factorial(n);
        int f_r=factorial(r);
       // int f_n_r=factorial(n-r);

        int ncr=f_n/f_r*(n-r);
        return ncr;
    }
    public static void main(String[] args) {
      
        int result=  bin_Coeff(5,2 );
        System.out.println(result);
        
    }
}
