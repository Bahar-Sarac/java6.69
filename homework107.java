
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Basamak sayısı giriniz: ");
        double basamak_sayisi = input.nextDouble();
        
        System.out.println(9* Math.pow(10, (basamak_sayisi-1)/2 ));
    }
    
}
