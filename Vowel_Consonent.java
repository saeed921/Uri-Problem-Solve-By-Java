
package vowel_consonent;
import java.util.Scanner;

public class Vowel_Consonent {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         char a =sc.next().charAt(0);
         if(a=='a' || a=='e' ||a=='i' ||a=='o'  ||a=='u' || a=='A' || a=='E' ||a=='I' ||a=='O'  ||a=='U'){
             
             System.out.println("Vowel");
             
         }else{
             System.out.println("Consonent");
         }
        
    }
    
}
