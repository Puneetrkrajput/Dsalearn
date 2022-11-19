package BitMagic;

public class odd_even {
    public static void Odd_Even(int n){
        int bitmask=1;
        if((n & bitmask ) == 0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("odd");
        }
    }
        public static void main(String[] args) {
            Odd_Even(3);
        }
}
