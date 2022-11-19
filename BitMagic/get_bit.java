package BitMagic;

public class get_bit {
    public static int get_Bit(int n , int i ){
        int bitmask=(1<<i); // we did o'th bit left shift upto the ith bit like previously we can find last now we can find ith
        if((n & bitmask )==0){
            return 0;
        }else{
        return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(get_Bit(5, 2));
        
    }
}
