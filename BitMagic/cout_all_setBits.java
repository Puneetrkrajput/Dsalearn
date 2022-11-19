package BitMagic;

public class cout_all_setBits {
    

    public static int cout_setBits(int n){
        int count=0;
        while(n>0){
        if((n & 1) != 0){
            count++;
        }
        
        n=n>>1;
    }
    return count;
    }
    public static void main(String[] args) {
        System.out.println(cout_setBits(10));
        
    }
}
