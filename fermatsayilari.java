
import java.util.Scanner;



/**
 *
 * @author Bahar
 */
public class fermatsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int x = 0;
        System.out.print("Terim sayısı giriniz: ");
            int n = input.nextInt();
                         
        System.out.println("Fermat sayıları: "); 
         for (int i = 0; i < n-1; i++) {
            x = (int) Math.pow(2,(Math.pow(2, i)+1));
             System.out.println(+x); 
         }
    }
    
}
