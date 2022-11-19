package function;

public class binary_decimal{

    public static void binToDec(int n){
        int myNum=n;
        int pow=0;
        int decNum=0;
        while(n>0){
            int LD=n%10;
            decNum=decNum+(int)(LD*Math.pow(2,pow));
            pow++;
            n=n/10;

        }
        System.out.println("decimal of "+myNum+"  is :  "+ decNum);
    }

    public static void main(String[] args) {
        binToDec(100);
        
    }
}
