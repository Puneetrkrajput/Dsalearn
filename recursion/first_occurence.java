
public class first_occurence {
    public static int fistoccur(int arr[],int i, int key){
            if(i==arr.length){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }
            return fistoccur(arr, i+1, key);
            
    }
    public static void main(String[] args) {
      
        int arr[]={2,4,6,3,2,6,7,3,};
        int key=3;
        int i=0;
        System.out.println(fistoccur(arr,i,key));
    }
}

