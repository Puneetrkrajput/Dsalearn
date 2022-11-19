package BitMagic;



public class clear_I_bits {
    public static int update_I_Bits(int n ,int i ){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(update_I_Bits(10, 2));
    }
}
