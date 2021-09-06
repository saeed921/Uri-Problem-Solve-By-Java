
package uri1043;
import java.util.Scanner;
public class Uri1043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        float a, b, c,p,t;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if(a+b>c && b+c>a && a+c>b){
            p=a+b+c;
            System.out.printf("Perimetro = %.1f\n",p);
            
        }else{
            t=((a+b)*c)/2;
            System.out.printf("Area = %.1f\n",t);
           
        }
            
        
    }
    
}
