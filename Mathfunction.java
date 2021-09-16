/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathfunction;
 import java.lang.*;
import java.util.Scanner;
public class Mathfunction {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i ;
        //i=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        double r;
        //r = n+n/Math.pow((m+n),2);
        r=2*Math.pow(m, 3)-4*Math.pow(n, 2*m)+7;
        System.out.println(r);
        
     
    }
    
}
