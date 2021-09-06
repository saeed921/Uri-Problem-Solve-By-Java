
package uri1048;
import java.util.Scanner;

public class Uri1048 {

 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n, s = 0, rg=0;
        n=sc.nextFloat();
        if( n>=0 && n <=400.00){
            s=((n*15)/100);
            rg=s+n;
            System.out.printf("Novo salario: %.2f\n",rg);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 15 %");
            
        }
        else if( n>=400.01 && n <=800.00){
            s=((n*12)/100);
            rg=s+n;
            System.out.printf("Novo salario: %.2f\n",rg);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 12 %");
            
        }
        else if( n>=800.01 && n <=1200.00){
            s=((n*10)/100);
            rg=s+n;
            System.out.printf("Novo salario: %.2f\n",rg);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 10 %");
            
        }
         else if( n>=1200.01 && n <=2000.00){
            s=((n*7)/100);
            rg=s+n;
            System.out.printf("Novo salario: %.2f\n",rg);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 7 %");
            
        }
        else if( n>2000.00){
            s=((n*4)/100);
            rg=s+n;
            System.out.printf("Novo salario: %.2f\n",rg);
            System.out.printf("Reajuste ganho: %.2f\n",s);
            System.out.println("Em percentual: 4 %");
            
        }
        
       
    }
    
}
