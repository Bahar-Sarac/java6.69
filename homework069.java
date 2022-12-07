
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework069 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        
        System.out.println("Sayı giriniz: ");
        double sayi = input.nextInt();
        System.out.println("Terim sayısı giriniz: ");
        int terim = input.nextInt();
        double T = 1;
        
        for (int i = 1; i < terim-1; i++) {
            double F = 1;
            for (int j = 1; j < 2*i; j++) {
                F = F * j;
            }
            T += Math.pow(-1,i) * Math.pow(sayi,2*i) / F;
        }
        System.out.println("Kosinüs:"+T);
    }
    
}
