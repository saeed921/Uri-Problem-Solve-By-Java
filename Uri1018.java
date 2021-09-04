
package uri1018;
import java.util.Scanner;

public class Uri1018 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,a=0,j=0,l=0,p=0;
        N=sc.nextInt();
       // while(n>60){
        j=N/60;
            //System.out.println(j);
        l=j/60;
        //System.out.println(l);
         a=j%60;
        //j=l%60;
        //System.out.println(a);
        p=N%60;
        //System.out.println(p);
        System.out.printf("%d:%d:%d\n",l,a, p);
        //System.out.printf("\n");
        
        
        
   // }
    
    }}
