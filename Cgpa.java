
package cgpa;
import java.util.Scanner;

public class Cgpa {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double  [] array= new  double [100];
        int i , n ,inp, temp=0; double cgpa = 0, num = 0;
        System.out.println("How much number you wanna input??");
        n=sc.nextInt();
        System.out.println("Enter your number");
        for (i=0; i<n;i++){
            array[i]=sc.nextDouble();
            if (array[i]>= 80){
                 num =5;
                
            }else if ((array[i]>70 && array[i]<=79)){
                num=4;
            
            }else if ((array[i]>60 && array[i]<=69)){
                num =3.5;
            }
            else if ((array[i]>50 && array[i]<=59)){
                num =3;
            }
            else if ((array[i]>40 && array[i]<=49)){
                num = 2;
            }
            else if ((array[i]>33 && array[i]<=39)){
               num = 1;
            }
            else if ((array[i]>0 && array[i]<=32)){
                num = 0;
            }
         
            
            
            
        }System.out.println("Enter an optional sub value");
        double optional;
        optional= sc.nextDouble();
        if(optional >=80){
            int num1=3;
        System.out.println(((num + num + num + num+ num + num + num)+num1)/n+1 );
        }else if (optional <80){
           int  num2=2;
                    System.out.println(((num + num + num + num+ num + num + num))+num2/n+1 );

        }
        
        
       
        
        
    }
    
}
