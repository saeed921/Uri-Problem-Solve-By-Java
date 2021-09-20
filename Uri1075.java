
package uri1075;
import java.util.Scanner;


public class Uri1075 {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n;
        n=sc.nextInt();
        for(i=0; i<=10000;i++){
            
            if(i%n==0){
                i=i+2;
                System.out.println(i);
            }
        }
        
        
    }
    
}
