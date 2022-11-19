package arrays;


public class print_subarray {

    public static void printSubarray(int arr[]){
        int tp=0;//for counting the total numbers of pair;


        for(int i=0;i<arr.length;i++){
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
          
                for (int k = start; k < end; k++) {//for printing
              
                    System.out.print(arr[i]+" ");//subarrays
                 
                }
                
                tp++;
                System.out.println();
                
            }
         
            System.out.println();
        }
        System.out.println("total pairs are "+tp);


    }

    public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    printSubarray(arr);        
    }    
}//find minimus sum and maximum sum and sum of all the sub arrays

