package BitMagic;

public class clear_bit {
    public static int clear_Bit(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_Bit(10, 1));
        
    }
    /* in this we take the not of bitmask because we need to reset the ith position
      10-> 1010    bitmaskof(1<<i)=  0010  but not of bitmask=1101
        &  1101
     *     -----
     *     1000
     *       ^ changed  
     */ 
}
