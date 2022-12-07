
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Terim sayısı: ");
        int terim_sayisi = input.nextInt();
        System.out.println("Heterometrik sayılar: ");      
        for (int i = 1; i < terim_sayisi; i++) {
            System.out.println(+i+(i+1)+(i*(i+1)));
        }
    }
    
}
