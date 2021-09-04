
package uri_1065;

import java.util.Scanner;
public class Uri_1065 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i, n, count=0;
        for(i=0; i<5;i++){
            n=sc.nextInt();
            if(n%2==0){
                
                count++;
            }
            
        }System.out.printf("%d valores pares\n", count);
    }
    
}
