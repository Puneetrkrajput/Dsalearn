<<<<<<< HEAD
public class isArraySorted {


    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6}; 
        System.out.println(issorted(arr, 0));

    }
}
=======
public class isArraySorted {


    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5,6}; 
        System.out.println(issorted(arr, 0));

    }
}
>>>>>>> 0b2ef9617bd7de5cb228c593b493ffa6038fa442
