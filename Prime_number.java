
package prime_number;
import java.util.Scanner;

public class Prime_number {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int p;
       p=sc.nextInt();
       if(p==1){
            System.out.println("Not prime Number ");
        }
        else  if( p==2|| p==3 || p==5 || p==7){
            System.out.println(" Prime Number");
        }
       
        else if( p%2==0 ){
         
         
         System.out.println("Not prime number");
         
         
       }else if(p%3==0 ){
         
         System.out.println("Not prime number");
           
       }
          
       
       else if(p%5==0 ){
          
         System.out.println("Not prime number");
           
       }else if(p%7==0 ){
          
         System.out.println("Not prime number");
       }
           
       
       else {
           System.out.println("Prime Number");
       }
    }
}
       
       
    
    

