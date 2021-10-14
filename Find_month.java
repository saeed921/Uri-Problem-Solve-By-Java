
package find_month;

import java.util.Scanner;
public class Find_month {

  
    public static void main(String[] args) {
    

       Scanner sc =new Scanner (System.in);

       int w =sc.nextInt();
       if(w== 1){
           System.out.printf("31");
       }
       else if(w== 2){
           System.out.println("28");
       }
       else if(w==3){
           System.out.println("31");
       }
       else if(w==4){
           System.out.println("30");
       }
       else if(w==5){
           System.out.println("June");
       }
       else if(w==6){
           System.out.println("31");
       }
       else if(w==7){
           System.out.println("31");
       }
       if(w== 8){
           System.out.printf("31");
       }
       else if(w== 9){
           System.out.println("30");
       }
       else if(w==10){
           System.out.println("31");
       }
       else if(w==11){
           System.out.println("30");
       }
       else if(w==12){
           System.out.println("31");
       }
       else {
           System.out.println("Flase");
       }
       
    }
       
    }
    

