
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class hilbertsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Pozitif tamsayı giriniz:");
        int s = input.nextInt();
        
        if ((s-1) % 4 == 0) {
            System.out.println(s+" hilbert sayısıdır");
        }
        else if ((s-1) % 4 != 0) {
            System.out.println(s+" hilbert sayısı değildir");
        }
    }
    
}
