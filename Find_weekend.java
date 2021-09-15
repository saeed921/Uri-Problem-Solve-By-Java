
package find_weekend;
import java.util.Scanner;

public class Find_weekend {

    public static void main(String[] args) {
       Scanner sc =new Scanner (System.in);
       int w =sc.nextInt();
       if(w== 1){
           System.out.printf("Saturday\n");
       }
       else if(w== 2){
           System.out.println("Sunday");
       }
       else if(w==3){
           System.out.println("MOnday");
       }
       else if(w==4){
           System.out.println("Tuesday");
       }
       else if(w==5){
           System.out.println("Wednesday");
       }
       else if(w==6){
           System.out.println("Thursday");
       }
       else if(w==7){
           System.out.println("Friday");
       }
       
    }
    
}
