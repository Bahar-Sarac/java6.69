
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class tausayisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Üst sınır giriniz: ");
        int N = input.nextInt();
        
        for (int i = 1; i <= N; i++) {
            int sayac = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    sayac++;
                }
            }    
                if (i % sayac == 0) {
                    System.out.println(i);
                }
        }
    }
    
}
