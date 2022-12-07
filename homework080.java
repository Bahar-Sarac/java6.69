
import java.util.Scanner; 


/**
 *
 * @author Bahar
 */      
public class homework080 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bölüm değeri giriniz: ");
        int bolum = input.nextInt();
        double t = 1;
        
        for (int i = 1; i < bolum; i++) {
            t = 2 + 1/t;
        }
       System.out.println("Sonuç = " +1*1/t);
    }
    
}
