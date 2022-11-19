package sorting;
import java.util.*;
;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
	public static void main (String[] args) throws java.lang.Exception
	
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int keshav = sc.nextInt();
	    int x[]=new int[keshav];
	    int y[]=new int[keshav];
	    for (int i=0;i<=keshav-1 ;i++ ){
	        x[i]=sc.nextInt();
	        y[i]=sc.nextInt();
	        
	    } 
        sc.close();
	    for (int i=0;i<=keshav-1 ;i++ ){
	        if(x[i]*2 > y[i]*5){
	            System.out.print("Chocolate\n");
	        }else if(x[i]*2 < y[i]*5){
	             System.out.print("Candy\n");
	            
	        }else{
	             System.out.print("Either\n");
	        }
	    } 
		// your code goes here
	}
}


