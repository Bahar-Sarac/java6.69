
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework078 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Terim sayısı giriniz: ");
        int terim = input.nextInt();
        double c = 1;
        
        for (int i = 1; i < terim; i++) {
            double c1 = 4*i*i;
            c *= c1 / (c1-1);
        }
        System.out.println("Sonuç: "+(2*c));
    }
    
}
