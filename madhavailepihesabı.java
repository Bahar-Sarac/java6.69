
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class madhavailepihesabı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     
     System.out.print("Terim sayısı giriniz: ");
     int n = input.nextInt();
     double t = 0;
     
        for (int i = 0; i < n-1; i++) {
            t += Math.pow(-1, i) / ((2*i+1)* Math.pow(3 ,i));
        }
        System.out.println("Sonuç: "+t);
    }
    
}
