
package swap_number;
import java.util.Scanner;


public class Swap_number {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,i,s=0;
       n=sc.nextInt();
        int m = 0;
       int l= m=n;
       
       while(n>=10){
           
           n=n/10;
           s=n;
      
    } System.out.println(s);
        
    
    l= l%10;
        System.out.println(l);
        System.out.println("sum of  1st and last digit"+s+l);
        int temp=s;
        s=l;
        l=temp;
        System.out.println(" s er man" + s);
        System.out.println("l er man " + l);
        System.out.println(m);
    }
    
}
    

