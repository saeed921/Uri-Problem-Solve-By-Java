
package reverse_number;
import java.util.Scanner;


public class Reverse_Number {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        
        int i;
        System.out.println("Start from ");
        n=sc.nextInt();
        System.out.println("End ");
        i=sc.nextInt();
        while(n!=i-1){
            
            System.out.println(n);
            n--;
            
        }
        
        
    }
    
}
