
import java.util.Scanner;



/**
 *
 * @author Bahar
 */
public class mukemmelsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
         System.out.print("Bir tamsayı giriniz:");
         int s = input.nextInt();
         int t = 0;
         for (int i = 1; i < s-1; i++) {
             if(s%i == 0){
                 t += i;
             }
             else if(s % i != 0){
             }
         }
          if(s == t){
              System.out.println(s+" mükemmel sayıdır");
          }
          else if(s != t){
             System.out.println(s+" mükemmel sayı değildir"); 
          }
        
    }
}
    

