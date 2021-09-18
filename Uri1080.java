/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1080;
import java.util.Scanner;
public class Uri1080 {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=0,count = 0;
        for(int i=1; i<=100;i++){
            int inp=sc.nextInt();
            if(inp>a){
                a=inp;
                count=i;
 
            }
            
            
        }System.out.println(a);
        System.out.printf("%d\n", count);
 
             
              
               
               
    }
    
}
