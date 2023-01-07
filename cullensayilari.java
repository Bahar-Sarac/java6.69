
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class cullensayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 0;
        System.out.print("Terim sayısı: ");
        int n = input.nextInt();
                         
        System.out.println("Cullen sayıları: "); 
         for (int i = 1; i < n; i++) {
            x = (int) Math.pow(i*2, i+1);
             System.out.println(+x); 
        }
    }
    
}
