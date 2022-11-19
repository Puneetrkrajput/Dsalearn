package arrays;

public class Max_subarray_sum_I {

    public static void maxSubarrays(int numbers[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                int end=j;
                curr=0;
                for (int k = start; k < end; k++) {//for printing
                    curr+=numbers[k];
                    
                }
                
                System.out.println(curr);
                if(maxsum<curr){
                    maxsum=curr;
                }
                
            }
            
        }
        System.out.println("the maximum of all subarray is: "+maxsum);





    }


    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarrays(numbers);
        
    }
}
