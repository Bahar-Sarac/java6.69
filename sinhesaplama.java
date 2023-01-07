
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class sinhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Terim sayısı giriniz: ");
        int terim = input.nextInt();
        double t = 0;
        
        for (int i = 1; i < terim; i++) {
            int f = 1;
            for (int j = 1; j < 2*i; j++) {
                f = f * j;
            }
            t += Math.pow(-1, i-1) * Math.pow(sayi, 2*i-1) / f ;
        }
        System.out.println("Sayının sinüs değeri:"+t);  
    }
    
}
