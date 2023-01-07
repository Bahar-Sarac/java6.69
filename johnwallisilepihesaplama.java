
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class johnwallisilepihesaplma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Terim sayısı giriniz: ");
        int n = input.nextInt();
        double k = 1;
        
        for (int i = 1; i < terim; i++) {
            double k1 = 4*i*i;
            k *= k1 / (k1-1);
        }
        System.out.println("Sonuç: "+(2*k));
    }
    
}
