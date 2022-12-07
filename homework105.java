
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tamsayı giriniz:");
        int sayi1 = input.nextInt();
        int t = 0;
        int s = 0;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i == 0) {
                t += i;
                s++;
            }
        }
        int sayi2 = t/s;
        int tamsayi;
        tamsayi = (int) sayi2;
        double tamsayıcevirme;
        tamsayıcevirme = (double) tamsayi;       
        if (sayi2-tamsayıcevirme == 0) {
            System.out.println("Aritmetik sayıdır");
        }
        else {
            System.out.println("Aritmetik sayı değildir");
        }
    }
    
}
