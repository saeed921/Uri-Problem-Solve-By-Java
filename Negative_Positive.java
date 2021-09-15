
package negative_positive;
import java.util.Scanner;


public class Negative_Positive {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int a;
        System.out.println("Enter Your Number");
        a=sc.nextInt(); 
        if (a==0 || a>0){
            System.out.println("Number is Positive");
        }if(a<0){
            
            System.out.println("Number is negative");
        
       
    }
    }
    
}
