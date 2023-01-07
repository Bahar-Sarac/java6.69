
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class fibonaciasallari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tekrar sayısını giriniz:");
        int n = input.nextInt();
        int s2 = 0;
        
        while (s2 < n) {
            int f1 = 1, f2 = 1;
            int f3 = f2 + f1;
            f1 = f2;
            f2 = f3;
            int s1 = 0;
            for (int i = 2; i < f3; i++) {
                if (f3 % i == 0) {
                    s1 = s1 + 1;
                }
            }
            if (s1 == 0) {
                s2++;
                System.out.println("f3:" + f3);
            }
        }
    }

}
