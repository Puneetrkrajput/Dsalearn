package BitMagic;

public class update_ith_bit {

    public static int clear_Bit(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

    public static int set_Bit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    public static int update_bit(int n, int i, int newbit){
        if (newbit==0){
        return clear_Bit(n, i);
        }else {
            return set_Bit(n, i);
        }

    }
    public static void main(String[] args) {
        System.out.println(update_bit(10, 1, 0));
        
    }

}
