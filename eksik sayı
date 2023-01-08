
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class eksiksayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Tam sayı giriniz: ");
        int sayi = input.nextInt();
        int t = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                t += i;
            }
        }
        if (t < 2*sayi) {
            System.out.println("Eksik sayıdır ve eksik sayı miktarı: "+(2*sayi-t));
        }
        else if (t >= (2*sayi)) {
              System.out.println("Eksik sayı değildir. ");       
        }
    }
    
}
