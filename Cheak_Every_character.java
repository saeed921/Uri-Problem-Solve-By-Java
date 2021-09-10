
package cheak_every_character;
import java.util.Scanner;


public class Cheak_Every_character {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>='a' && a<='z' || a>='A' && a<='Z' ){
            
            System.out.println("Alphabet");
            
        }
        else if(a>='0' && a<='9'){
            
            System.out.println("Number");
        }
        else {
            System.out.println(" Special Character");
        }
        
       
        
    }
    
}
