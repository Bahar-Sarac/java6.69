
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class homework086 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Üst sınır değeri giriniz: ");
        int n = input.nextInt();
        
        for (int i = 2; i <= n; i++) {
            int s = 0;
            for (int j = 1; j <= i; j++) 
                if(i % j == 0)
                s += 1;
                if(s==2)
                    System.out.println("Asal sayılar: "+i);   
            }
        }
        
       
    }
    

