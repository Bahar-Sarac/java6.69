
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework087 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("İki basamağı da asal sayı olanlar: ");
        for (int i = 2; i <= 7; i++) {
            for (int j = 2; j <= 7; j++){
            if((i==2||i==3||i==5||i==7)&&(j==2||j==3||j==5||j==7))
                System.out.println (10*i+j);
            }
        }
    }
    
}
