package arrays;

public class liner_search {

    public static int get_key(int nums[], int key){

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums []={1,2,3,5,36 ,42,9,6,7,36};
        int key=36;

        int index=get_key(nums, key);

        if(index==-1){
            System.out.println(" the is not found");
        }else{
            System.out.println("the is is present at the index of :  "+index);
        }

        
    }
    
}
