package String;

public class String_compression {
    public static String compress(String str){
        String str1=new String(    );
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;

            }
            str1 +=str.charAt(i);
            if(count>1){
                str1 +=count.toString();
            }


        }
        return  str1;
    }
    public static void main(String[] args) {
        String str=("aaaabbffttt");
        System.out.println(compress(str));
        
    }
}
