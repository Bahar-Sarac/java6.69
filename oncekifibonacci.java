
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class oncekifibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("f2 değerini giriniz: ");
        int f2 = input.nextInt();

        double ao = (1 + Math.pow(5, 1 / 2));
        int f1 = (int) (f2 / ao);
        int f3 = (int) (f2 * ao);

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
    }
    
}
