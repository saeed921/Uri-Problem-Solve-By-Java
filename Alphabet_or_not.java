
package alphabet_or_not;
import java.util.Scanner;

public class Alphabet_or_not {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char inp=sc.next().charAt(0);
        
        if(inp >='a' && inp<='z' || inp >='A' && inp<='Z'){
            
            System.out.println("Alphabet");
        }else{
            
            System.out.println("Not");
        }
        
    }
    
}
