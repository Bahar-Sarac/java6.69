

import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework089 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
     
        int s1 = 0;
        int s2 = 0;
        int n;
        while(true){
            System.out.print("Tamsayı giriniz: ");
            n = input.nextInt();
            if(n > 0){
                break;
            }
        }
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                s1++;
                break;
            }
            if((n+2)%i == 0){
                s2++;
                break;
            }
        }
        if(s1==0 && s2==0 && n!=2 && n!=1 && n!=0){
            System.out.print("Sayınız chen asalıdır.");
        }
        else{
            System.out.println("Sayınız chen asalı değildir.");
        }
         
              
    }
    
}
