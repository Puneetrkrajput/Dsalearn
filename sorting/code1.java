package sorting;

    import java.util.*;
   
    
    /* Name of the class has to be "Main" only if the class is public. */
    class Code1
    {
        public static void main (String[] args) throws java.lang.Exception
        
        {
            Scanner sc=new Scanner(System.in);
            
            int size=sc.nextInt();
            int x[]=new int[size];
            int y[]=new int[size];
            int z[]=new int[size];
            int ans[]=new int[size];
            for (int i=0;i<=size ;i++ ){
                x[i]=sc.nextInt();
                y[i]=sc.nextInt();
                z[i]=sc.nextInt();
                
            } 
            sc.close();
             for (int i=0;i<=size ;i++ ){
                 ans[i]= (int)((y[i]+z[i]-1)/z[i])*x[i];
                 System.out.println(ans[i]);
            // your code goes here
        }
    }
    }
    
    

