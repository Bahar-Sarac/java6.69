
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class pellsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Terim sayısı giriniz:");
        int n = input.nextInt();

        double p1 = 0;
        double p2 = 1;
        double p3;
        System.out.println("p1: "+p1);
        System.out.println("p2: "+p2);

        for (int i = 1; i <= n-2 ; i++) {
            p3 = (2 * p2) + p1;
            System.out.println(p3+ ", ");
            p1 = p2;
            p2 = p3;
        }
    }
    
}
