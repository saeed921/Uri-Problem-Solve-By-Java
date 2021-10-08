
package uri1094;
import java.util.Scanner;

public class Uri1094 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, r=0; char c;
        int inp= sc.nextInt();
        for(int i =0 ; i<inp; i++ ){
            n=sc.nextInt();
            c=sc.next().charAt(0);
            if(c=='c'){
           r=r+n;
            }
            
            
        }System.out.println(r);
       
    }
    
}
