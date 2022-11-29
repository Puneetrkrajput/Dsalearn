package arrays;
//import java.util.*;

public class binary_search {

    public static int bin_search(int numbers[],int  key){

        int start=numbers[0];
        int end=numbers.length;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(numbers[mid]==key)
            return mid;
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return-1;
        


    }
    public static void main(String[] args) {
        int numbers[]={2,3,5,6,7,12,13};
        int key=7;
        System.out.println("The key is at index of: "+bin_search(numbers, key));
        System.out.println("heloo");
    
    }
    
}
