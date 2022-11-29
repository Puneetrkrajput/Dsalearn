
public class last_occurence {
    public static int lastoccur(int arr[],int i, int key){
      if(i==arr.length){
        return -1;
      }
      int isfound=lastoccur(arr, i+1, key);
      if(isfound== -1 && arr[i]==key ){
        return i;
      }
      return isfound;


}
public static void main(String[] args) {
  
    int arr[]={2,4,6,3,2,6,7,3,4};
    int key=3;
    int i=0;
    System.out.println(lastoccur(arr,i,key));
}
}
