
package find_factorial;
import java.util.Scanner;


public class Find_factorial {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,j,sum=1;
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            sum=sum*i;
            
            
        }System.out.println( sum);
       
    }
    
}
