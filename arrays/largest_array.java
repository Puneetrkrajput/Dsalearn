package arrays;


public class largest_array {
    
    public static int get_largest(int numbers[]){
        int largest= Integer.MIN_VALUE; //-infinity
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }


        }
        System.out.println("the smallest number is: "+smallest);
        return largest;
    }


    public static void main(String[] args) {

        int number[]={1,2,3,9,7,8,6,11};
        System.out.println(" largest value is: "+get_largest(number));

        
    }
}
