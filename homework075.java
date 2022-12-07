
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework075 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.print("Sayı giriniz: ");
      int sayi = input.nextInt();
      System.out.print("Terim sayısını giriniz: ");
      int terim = input.nextInt();
      double sonuc = (double) Math.pow(1+sayi/terim , terim);
      System.out.println("Sonuç: "+sonuc);
    }
    
}
