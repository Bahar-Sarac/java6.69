
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework085 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bir doğru parçası uzunluğu giriniz: ");
        double u = input.nextDouble();
        
        double b = u / (2+ Math.pow(2,5));
        double a = u-b;
        
        System.out.println("Gümüş oran parçalarının uzunlukları: "+a+ "  ve  "+b);
    }
    
}
