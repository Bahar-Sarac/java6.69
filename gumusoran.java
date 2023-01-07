
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class gumusoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bir doğru parçası uzunluğu giriniz: ");
        double x = input.nextDouble();
        
        double b = x / (2+ Math.pow(2,5));
        double a = x - b;
        
        System.out.println("Gümüş oran parçalarının uzunlukları: "+a+ "  ve  "+b);
    }
    
}
