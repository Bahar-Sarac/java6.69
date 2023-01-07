
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class polindromsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
               System.out.println("Üç basamaklı polindrom sayılar:"+(100*i + 10*j + i));
            }
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println("Dört basamaklı polindrom sayılar:"+(1000*i + 100*j + 10*j + i));
            }
        }
    }
    
}
