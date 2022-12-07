
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework093 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = 0;
        System.out.print("Terim sayısı: ");
           int n = input.nextInt();
                         
        System.out.println("Cullen sayıları: "); 
         for (int i = 1; i < n; i++) {
            a = (int) Math.pow(i*2,i+1);
             System.out.println(+a); 
        }
    }
    
}
