
package uri1040;
import java.util.Scanner;
public class Uri1040 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        float a,b,c,d, wavg, n, avg;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=sc.nextFloat();
        wavg=((a*2)+(b*3)+(c*4)+(d*1))/10;
        System.out.printf("Media: %.1f\n",wavg);
        if(wavg>7.0){
            
            System.out.println("Aluno aprovado.");
        }else if(wavg<5.0){
            System.out.println("Aluno reprovado.");
        }
        
        else if(wavg>=5.0 && wavg<=6.9){
            
            System.out.println("Aluno em exame.");
            n=sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", n);
            avg=(wavg+n)/2;
            if(avg>=5.0){
                System.out.println("Aluno reprovado.");
            }else if(avg<=4.9){
                System.out.println("Aluno reprovado.");
                
            }System.out.printf("Media final: %.1f\n",avg);
        }
        
        
    }
    
}
