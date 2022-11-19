package patterns;
public class Character {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        for (int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.println(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
