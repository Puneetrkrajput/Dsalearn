package patterns;

public class hollow_rec {

    public static void printRec(int tot_rows, int tot_col){
        for(int i=1;i<=tot_rows;i++){
            for (int j = 1; j <=tot_col; j++) {
                if(i==1 || i==tot_rows ||j==1|| j==tot_col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printRec(4,5);
        
    }
} 
