
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework079 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        double m = 0;
        double x;
        double y;
        double max = 0;
        double sonuc;
        
        
        System.out.print("Bir pozitif tam sayı giriniz: ");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
           x = (Double) (2*Math.random()*(max)/(max-1));
           y = (Double) (2*Math.random()*(max)/(max-1));
           
            if((Math.pow(x, 2)+Math.pow(y, 2))<1);
             m++;
        }
        sonuc = 4*m/n;
                System.out.println("Monte Carlo yöntemi ile hesaplanan pi sayısı: "+sonuc);
        
    }
    
}
