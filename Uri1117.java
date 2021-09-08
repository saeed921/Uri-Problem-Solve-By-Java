
package uri1117;
import java.util.Scanner;
public class Uri1117 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        float i, x=0,sum=0, n, y=0;
        for( i=0  ; i<=10; i++){
            if(x==2){
                break;
            }
        n=sc.nextFloat();
       
            
          
            if(n>0 && n<=10){
                
                 x++;
                sum=sum+n;
   
        } else {
                System.out.println("nota invalida");
            }

} y=sum/(2);
   
    System.out.printf("media = %.2f\n",y);
    }
}
