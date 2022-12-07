
import java.util.Scanner;



/**
 *
 * @author Bahar
 */
public class homework094 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int a = 0;
        System.out.print("Terim sayısı: ");
            int n = input.nextInt();
                         
        System.out.println("Fermat sayıları: "); 
         for (int i = 0; i < n-1; i++) {
            a = (int) Math.pow(2,(Math.pow(2, i)+1));
             System.out.println(+a); 
         }
    }
    
}
