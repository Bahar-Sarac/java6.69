
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework076 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("N: ");
       int N = input.nextInt();
       double toplam = 0;
       for (int i = 2; i <= (N-2)/2; i+=2) {
           int fakt = 1;
           for (int j = 1; j <= i; j++) {
               fakt *= j;
           }
            toplam += (double) i/fakt;
       }
    System.out.println("Toplam: "+toplam);
    }
    
}
