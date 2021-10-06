
package number_divided_ornot;
import java.util.Scanner;

public class Number_Divided_ornot {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       if(a%5==0 || a%11==0){
           System.out.println("Divided");
       }else{
           System.out.println("Not");
       }
       
        
        
    }
    
}
