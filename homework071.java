
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework071 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
         System.out.print("Terim sayısı giriniz: ");
         int sayi= input.nextInt();
         double t = 0;
         for (int i = 0; i< sayi ; i++) {
          t+= (double) 1/((2*i+1)*(2*i+2));
         }
          System.out.println("Seri açılımı: "+t);
    }
}  