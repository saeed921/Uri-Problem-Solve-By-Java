/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_1094;
import java.util.Scanner;
/**
 *
 * @author SaeedZ
 */
public class Uri_1094 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
        int n,num,i, sum =0, sum1=0, sum2=0, total=0; char chr;
         double per1, per2,per3;
        n=sc.nextInt();
        for(i=0; i<n;i++){
            
            num=sc.nextInt();
            chr=sc.next().charAt(0);
            if(chr=='C'){
                sum=sum+num;
                
            }
            else if(chr=='R'){
                sum1=sum1+num;
                
            }
            else if(chr=='S'){
                sum2=sum2+num;
                
            }
            
            
        } total=sum+sum1+sum2;
        System.out.printf("Total: %d cobaias\n", total);
        
        System.out.printf("Total de coelhos: %d\n",sum);
        System.out.printf("Total de ratos: %d\n",sum1);
         System.out.printf("Total de sapos: %d\n",sum2);
         per1=  (sum*100.00)/total;
         per2= (sum1*100.00)/total;
         per3=(sum2*100.00)/total;
         System.out.printf("Percentual de coelhos: %.2f",per1);
		System.out.print(" %\n");
		System.out.printf("Percentual de ratos: %.2f",per2);
		System.out.print(" %\n");
		System.out.printf("Percentual de sapos: %.2f",per3);
		System.out.print(" %\n");
        
    }
    
}
