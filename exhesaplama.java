
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class exhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
      
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Terim sayısını giriniz: ");
        int n = input.nextInt();
        double t = 1;
        double f = 1;
        
        for (int i = 1; i < n-1; i++) {
            f = f*1;
            t += Math.pow(sayi,i) / f;
        }
        System.out.println("e^x = "+t);
    }
    
}
