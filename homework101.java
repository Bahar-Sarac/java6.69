
import java.util.Scanner;
/**
 *
 * @author Bahar
 */
public class homework101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Üst sınır giriniz:");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            int s = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) {
                    s++;
                }
            }    
                if (i%s == 0) {
                    System.out.println(i);
                }
        }
    }
    
}
