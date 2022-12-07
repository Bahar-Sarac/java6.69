
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         
        System.out.print("Terim sayısı: ");
        int terim_sayisi = input.nextInt();
         System.out.println("Üçgensel sayılar: ");
         
        for (int i = 1; i <= terim_sayisi; i++) {
            int u = i * (i+1) / 2;
            System.out.println(+u);
        }
    }
    
}
