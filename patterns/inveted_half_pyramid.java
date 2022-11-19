package patterns;

public class inveted_half_pyramid {
    public static void inv_rot_tri(int n){
        for(int i=1;i<=n-1;i++){
            //for spaces
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        } 
    }
    public static void main(String[] args) {
        inv_rot_tri(50);
        
    }
    

}
