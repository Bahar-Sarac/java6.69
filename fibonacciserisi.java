
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class fibonacciserisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Terim sayısı giriniz:");
        int terim= input.nextInt();
        int terim1 = 1;
        int terim2 = 1;
        System.out.println("Birinci terim: "+terim1);
        System.out.println("İkinci terim: "+terim2);
        
        for (int i = 1; i <= terim-2; i++) {
            int terim3 = terim1 + terim2;
            System.out.println("Üçüncü terim: "+terim3);
            terim1 = terim2;
            terim2 = terim3;
        }
    }
    
}
