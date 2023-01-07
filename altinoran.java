
import java.util.Scanner;


/**
 *
 * @author Bahar
 */ 
public class altinoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         
         double ab;
         double cb;
         double ac;
        
         System.out.print("Doğru parçasının uzunluğunu giriniz: ");
         ab = input.nextDouble();
         cb = 2 * ab / (1+Math.pow(5, 0.5));
         ac = ab - cb;
         System.out.println("Altın oran "+ac);
         System.out.println("Altın oran "+cb);
         
        
    }
    
}
