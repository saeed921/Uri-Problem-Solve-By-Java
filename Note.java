
package note;
import java.util.Scanner;

       

public class Note {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r =0, j=0;
        
        int note=sc.nextInt();
       
        /*if(note >= 500)
    {
        r=note/500;
        System.out.println("note 500:"+r);
        note=note%500;
    }**/
       // while(note!=0){
        
    if(note >= 100)
    {
        r=note/100;
        System.out.printf("%d nota(s) de R$ 100,00\n",r);
        note=note%100;
    }else {
        System.out.printf("%d nota(s) de R$ 100,00\n",j);
    }
     if(note >= 50)
    {
        r=note/50;
        System.out.printf("%d nota(s) de R$ 50,00\n",r);
        note=note%50;
    }else {
        System.out.printf("%d nota(s) de R$ 50,00\n",j);
    }
     if(note >= 20)
    {
        r=note/20;
        System.out.printf("%d nota(s) de R$ 20,00\n",r);
        note=note%20;
    }else {
        System.out.printf("%d nota(s) de R$ 20,00\n",j);
    }
     if(note >= 10)
    {
        r=note/10;
        System.out.printf("%d nota(s) de R$ 10,00\n",r);
        note=note%10;
    }else {
        System.out.printf("%d nota(s) de R$ 10,00\n",j);
    }
     if(note >= 5)
    {
        r=note/5;
        System.out.printf("%d nota(s) de R$ 5,00\n",r);
        note=note%5;
    }else {
        System.out.printf("%d nota(s) de R$ 5,00\n",j);
    }
     if(note >= 2)
    {
        r=note/2;
        System.out.printf("%d nota(s) de R$ 2,00\n",r);
        note=note%2;
    }else {
        System.out.printf("%d nota(s) de R$ 2,00\n",j);
    }
     if(note >= 1)
    {
        r=note/1;
        System.out.printf("%d nota(s) de R$ 1,00\n",r);
        note=note%1;
    }else {
        System.out.printf("%d nota(s) de R$ 1,00\n",j);
    }
        
    
        
        
        }
}
//}
