
package uri1066;
import java.util.Scanner;

public class Uri1066 {

    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        int i, n, evn=0,odd=0,pos=0,neg=0;
        for(i=0; i<5;i++){
            n=sc.nextInt();
            if(n%2==0)
                
                evn++;
            else odd++;
            
            if(n>0)
                pos++;
            
        else if(n<0)
            neg++;
                
                
        } System.out.printf("%d valor(es) par(es)\n",evn);
        System.out.printf("%d valor(es) impar(es)\n",odd);
        System.out.printf("%d valor(es) positivo(s)\n",pos);
        System.out.printf("%d valor(es) negativo(s)\n",neg);
        
    
}
}
