
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class montecarloilepihesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        double a = 0;
        double b;
        double c;
        double max = 0;
        double sonuc;
        
        
        System.out.print("Bir pozitif tam sayı giriniz: ");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
           x = (Double) (2 * Math.random() * (max) / (max-1));
           y = (Double) (2 * Math.random() * (max) / (max-1));
           
            if((Math.pow(b, 2) + Math.pow(c, 2)) < 1);
             a++;
        }
        sonuc = 4*a/n;
                System.out.println("Monte Carlo yöntemi ile hesaplanan pi sayısı: "+sonuc);
        
    }
    
}
