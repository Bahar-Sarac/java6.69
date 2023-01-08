
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class dostsayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();    
        int ta = 0;
        int tb = 0;
        
        for (int i = 1; i < a-1; i++) {
            if (a % i == 0) {
                ta += +i;  
            }
        }
        for (int i = 1; i < b-1; i++) {
            if (b % i == 0) {
                tb += +i;
            }
        }
        if (ta==b && tb==a) {
            System.out.println("Dost sayılardır.");
        }
        
        else {
            System.out.println("Dost sayı değillerdir.");
        }
    }
    
}
