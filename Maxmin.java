
package javaapplication11;
import java.util.Scanner;

public class Maxmin {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int a ,b;
        System.out.println("Enter Your Number");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            
            System.out.println("a is greater");
        } else if(b>a && b>c){
            System.out.println("B is greater");
        }
        
        
        else {
            System.out.println("C is greater");
        }
        
        
        
    }
    
}
