
import java.util.Scanner; 


/**
 *
 * @author Bahar
 */
public class kokbeshesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bölüm değeri giriniz: ");
        int bolum = input.nextInt();
        double t =1;
        
        for (int i = 1; i < bolum-1; i++) {
            t = 4 + 1/t;
        }
       System.out.println("Sonuç = " +(2+1/t));
    }
    
}
