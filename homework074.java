
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Terim sayısını giriniz: ");
        int terim = input.nextInt();
        double t = 1;
        double F = 1;
        
        for (int i = 1; i < terim-1; i++) {
            F = F*1;
            t += Math.pow(sayi,i) / F;
        }
        System.out.println("e^x = "+t);
    }
    
}
