/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1065;

import java.util.Scanner;
public class Uri1065 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float i, n, sum=0, r=0;int count=0;
        
        for(i=0; i<=5;i++){
            n=sc.nextFloat();
            if(n>0){
                
                count++;
                sum=sum+n;
                r=sum/count;
                
                
            }

        
    }
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n", r);
    
}
}
