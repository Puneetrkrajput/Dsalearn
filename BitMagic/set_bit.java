package BitMagic;

public class set_bit {
    public static int set_Bit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;

    }
    public static void main(String[] args) {
       System.out.println( set_Bit(10, 2));

    }
    /*  it will return 14 because  10 in bin = 1010 we OR it with bit mask 1<<i 
     * 1010
     * 0100
     * -----
     * 1110  -> which is 14 in dec
     * 
    */
}
