package patterns;

public class inverted_half_num_pyramid {

    public static void inv_hlf_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j ++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inv_hlf_pyramid(5);
    }
}
