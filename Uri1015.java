
package uri1015;

import java.util.Scanner;
public class Uri1015 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       double x1,x2,y1,y2, d,sum,e,r;
       x1=sc.nextDouble();
       y1=sc.nextDouble();
       x2=sc.nextDouble();
       y2=sc.nextDouble();
       d=Math.pow((x2-x1), 2);
       sum=Math.pow((y2-y1), 2);
       e=d+sum;
       
       r=Math.sqrt(e);
        System.out.printf("%.4f\n",r);
       
        
       
    }
    
}
