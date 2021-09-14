
package print_alphabet;
import java.util.Scanner;


public class Print_alphabet {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        char a;
        a=sc.next().charAt(0);
        while(a>='a' && a<='z'){
            System.out.println(a);
            a++;
            
        }
       
    }
    
}
