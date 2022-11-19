package loops;
import java.util.Scanner;

public class Circle_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        sc.close();
        float area=3.14f*radius*radius; // by default java takes any decimal number as double so we need to specify it as 3.14f
        System.out.println(area);
    }
    
}
