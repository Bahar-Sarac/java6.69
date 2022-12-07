
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework072 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = 99;
        int min = 1;
        
        Scanner input = new Scanner(System.in);
        int randomsayi = (int) (Math.random()) * (max - min - 1);
        int deneme = 0;
        
        while (true) {
            System.out.print("lütfen 1 99 arası sayı giriniz: ");
            int sayi = input.nextInt();
            deneme++;
            if (sayi > randomsayi) {
                System.out.println("Lütfen daha küçük bir sayı giriniz: ");
            } else if (randomsayi > sayi) {
                System.out.println("Lütfen daha büyük bir sayı giriniz: ");
            } else if (randomsayi == sayi) {
                System.out.print("Tebrikler doğru tahmin: ");
                break;
            }
        }
       System.out.println(deneme + "kadar tahminde doğru sonuca ulaştınız");
       
        
    }
    
}
