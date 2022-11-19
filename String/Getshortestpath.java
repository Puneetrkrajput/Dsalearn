package String;

public class Getshortestpath {

    public static float displacementpath(String path){
        int x=0;
        int y=0;

        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else{
                x--;
            }
            
        }
        int x2=x*x;// x square
        int y2=y*y;// y square they are for finding the displacement

        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(displacementpath(path));

    }
}
