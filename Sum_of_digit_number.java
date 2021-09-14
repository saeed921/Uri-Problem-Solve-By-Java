
package sum_of_digit_number;
import java.util.Scanner;
import java.lang.Package;


public class Sum_of_digit_number {

   
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n,i=0,r  , sum=1;
         n=sc.nextInt();
         
   
    while(n!=0)
    {
        r=n%10;
        //System.out.println(r);
        n=n/10;
        //System.out.println(n);
        sum=sum*r;
        //System.out.println(sum);
    }
    
        
        System.out.println(    sum);
        //System.out.println(Math.pow(2, 3));
}
}
