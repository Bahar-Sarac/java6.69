
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Terim sayısı:");
        int terim_sayisi = input.nextInt();
        int T1 = 1;
        int T2 = 1;
        System.out.println("T1: "+T1);
        System.out.println("T2: "+T2);
        for (int i = 1; i <= terim_sayisi-2; i++) {
            int T3 = T1+T2;
            System.out.println("T3: "+T3);
            T1 = T2;
            T2 = T3;
        }
    }
    
}
