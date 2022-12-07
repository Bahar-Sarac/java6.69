
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        System.out.print("Terim sayısı: ");
        int n = input.nextInt();
        int k0 = 0;
        int k1 = 1;
        System.out.println(+k1);
        for (int i = 1; i < n-1; i++) {
            int k2 = 34*k1 - k0+2;
            System.out.println(+k2);
            k0 = k1;
            k1 = k2;
        }
    }
    
}
