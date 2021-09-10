
package uri1116;
import java.util.Scanner;
public class Uri1116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        double x, y, i, n, sum;
        n=sc.nextInt();
        
        for(i=0; i<n; i++){
            
            x=sc.nextInt();
            y=sc.nextInt();
            
            
             if(((x>0 || x<0) && y==0)) {
                System.out.println("divisao impossivel");
            }
             else  if(x>y || x<y || x==y){
                 sum=x/(y);
                
                System.out.printf("%.1f\n",sum);
                
            
            }
            
        }
       
    }
    
}
