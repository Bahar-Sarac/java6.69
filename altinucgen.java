
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class altinucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Üçgenin kısa kenarının uzunluğunu giriniz: ");
        double k = input.nextDouble();
        double b = k * (1+ Math.sqrt(5)) / 2;
        
        System.out.println("Kısa kenar : "+k);
        System.out.println("Birinci uzun kenar : "+b);
        System.out.println("İkinci uzun kenar : "+b);
                
        
    }
    
}
