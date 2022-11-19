package sorting;

public class bubble {

    public static void bubble_sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
                
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {19,46,8,41,55,47,68,16,37,28,17,3,64,29,50,59,32,67,14,36,5,52,15,7,48,9,40,25,4,54,31,45,61,18,32};
        bubble_sort(arr);
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
        }
    }
    
}
