
package result_sheet;
import java.util.Scanner;

public class Result_sheet {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int p,c,m,b,i;
        p=sc.nextInt();
        c=sc.nextInt();
        m=sc.nextInt();
        b=sc.nextInt();
        i=sc.nextInt();
        
        
        //int pr=p*100/100;
        //System.out.println(pr);
        int pr;
                pr=(p+c+m+b+i)/5;
        System.out.println("Parcentage:="+pr);
        if(p<40 || c<40|| m<40||b<40||i<40)
            System.out.println("Grade F");
        
        else if(pr>=90)
            
            System.out.println("Grade A" );
        
        else if(pr>=80)
            //System.out.println(pr);
            
            System.out.println("Grade B" );
        
        else if(pr>=70)
            
            System.out.println("Grade C" );
        
        else if(pr>=60)
            
            System.out.println("Grade D" );
        
        else if(pr>=40)
            
            System.out.println("Grade E" );
        
        else if(pr<40)
            
            System.out.println("Grade F" );
        
        
        
    }
    
}
